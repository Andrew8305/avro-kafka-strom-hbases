# avro-kafka-strom-hbases
consume kafka Avro data into storm, deserialize avro into object and save them into bases

##Pre-Requisites
- 1, kafka
- 2, storm
- 3, hbase

##features:
- 1, support avro data from kafka; avro data is original from OGG(or others) that comes from some avro schema format;
- 2, bolts int strom do deserialization from avro, and save object into hbase;
- 3, support multi hbase tables at the sametime;

##contact:
- email: yilong2001@126.com
- wechat: yilong2001


##特性
- 支持从kafka读取 avro格式的数据
- 在storm自动完成avro多个schema格式数据的解析
- 数据可以存入hbase，不同的schema avro数据可以存入不同的hbase table

