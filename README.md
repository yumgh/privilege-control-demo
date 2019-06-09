# 数据库表字段级别权限控制

##  如何实现

> 权限配置在数据库，和业务表结构一致，表定义参见db/ddl

查询业务表前，先查询权限表，之后将权限作为查询参数传入，在xml文件中进行动态SQL拼接，从而实现，只查询有权限的字段

e.g. 调用同一个接口进行测试

> 测试脚本参见db/dml

查询订单详情： [http://localhost:9001/order/detail](http://localhost:9001/order/detail)

系统`order-admin`

``` json
{
  "systemId": "order-admin",
  "sceneId": "query-order-detail",
  "userId": "1001"
}
```

执行的SQL语句：

``` sql
select order_id, user_id, created_by, created_date, updated_by, updated_date from goods_order where user_id = ? 
```

返回结果

``` json
{
    "code": "200001",
    "message": "查询成功",
    "body": [
        {
            "id": null,
            "orderId": 10001,
            "userId": 1001,
            "goodsCount": null,
            "totalMoney": null,
            "createdBy": "test",
            "createdDate": "2019-06-09T13:35:13.000+0000",
            "updatedBy": "test",
            "updatedDate": "2019-06-09T13:35:41.000+0000"
        }
    ]
}
```

系统`user-order-detail`

``` json
{
  "systemId": "user-order-detail",
  "sceneId": "query-order-detail",
  "userId": "1001"
}
```

执行的SQL语句

```sql
select goods_count, total_money from goods_order where user_id = ? 
```

返回结果

```json

{
    "code": "200001",
    "message": "查询成功",
    "body": [
        {
            "id": null,
            "orderId": null,
            "userId": null,
            "goodsCount": 3,
            "totalMoney": 876.5,
            "createdBy": null,
            "createdDate": null,
            "updatedBy": null,
            "updatedDate": null
        }
    ]
}
```

