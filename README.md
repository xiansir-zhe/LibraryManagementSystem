# Library_Management_System
同时为了完成学校数据库课程的课程设计，主要运用了netBeans、JFrame和mysql等技术。完成了UI设计与前后端交互代码编写，完成了图书馆管理系统的CURD。



系统分析
作为管理系统，图书馆管理员作为主要角色，并实现以下功能：
* 管理员注册
* 管理员维护图书信息。
* 管理员维护读者信息。
* 借书还书登记
* 借还记录查询
* 逾期不还查询
* 书籍借还数据展示

系统设计

![image](https://user-images.githubusercontent.com/77662779/230870751-834c9126-9215-41c3-b9c4-be0a5d9f516b.png)




数据库设计



![image](https://user-images.githubusercontent.com/77662779/230870855-53b2eec7-23d7-4843-bdf9-df820260aaba.png)
![image](https://user-images.githubusercontent.com/77662779/230870897-8fa5cd50-403d-4f3e-8c05-4badd078f818.png)
![image](https://user-images.githubusercontent.com/77662779/230870918-7b940547-3948-4d55-8b7d-a3ae319413f7.png)
![image](https://user-images.githubusercontent.com/77662779/230870937-5d78b717-aa2b-47bb-89a2-0a361e60a367.png)
![image](https://user-images.githubusercontent.com/77662779/230870952-ec968e19-b7ed-4d83-abba-c31c816fdee4.png)
![image](https://user-images.githubusercontent.com/77662779/230870972-be1114d2-0d6d-4503-8239-1135ab1e8c33.png)











用户使用流程图
进入注册页面完成注册
![image](https://user-images.githubusercontent.com/77662779/230870994-af9600e5-524f-4d47-bb5b-a6e0fb4a3bb4.png)



使用用户名和密码进行登录
![image](https://user-images.githubusercontent.com/77662779/230871020-18769f33-6ba7-43ab-a987-66dd102148e2.png)



登录成功后进入主界面
![image](https://user-images.githubusercontent.com/77662779/230871042-8b710089-da99-47bd-90f9-7e4ec62c21b1.png)






根据左侧的功能区，可使用下面的功能：

管理图书信息
![image](https://user-images.githubusercontent.com/77662779/230871072-8604e2b0-f465-45bf-b173-c9f8a3745fbe.png)


管理学生信息
![image](https://user-images.githubusercontent.com/77662779/230871104-e17b372a-cdb1-408a-beef-c9fcbc1f973c.png)



为学生借阅书籍
![image](https://user-images.githubusercontent.com/77662779/230871129-90175db5-8b1a-46a9-a219-d77ab91f0594.png)



归还图书

![image](https://user-images.githubusercontent.com/77662779/230871150-e51c7696-a07d-40db-b0c9-c205ebd2c96a.png)






查询借阅记录
![image](https://user-images.githubusercontent.com/77662779/230871175-a03843ba-53e3-41f2-80d1-87ac49b87804.png)




查询图书未归还的借阅记录
![image](https://user-images.githubusercontent.com/77662779/230871201-e4550b65-125d-4bc0-8374-d0f2ef254a47.png)











查询逾期未还的借阅记录（还书时间与当前系统时间相比）
![image](https://user-images.githubusercontent.com/77662779/230871224-a81b38a4-1eed-4876-8802-d18fa65d9b07.png)






主界面Logout后重新回到登录界面

![image](https://user-images.githubusercontent.com/77662779/230871265-59dab501-ab5c-4be1-8df1-ed2ba964f9e1.png)


环境说明
前端使用Jframe框架，并使用若干第三方组件和相应接口；后端使用Mysql+Java+JDBC，编写IDE为Apache-NetBeans。
