[TOG]
# Login-Project 登录案例

## 需求
用户录入用户名和密码
- 若在数据库中存在该用户名和密码：提示：xxx，欢迎回来 
- 若在数据库中不存在该用户名和密码： 提示：登录失败

## 步骤
### 1.创建数据库和表结构
### 2.创建动态的web项目
### 3.创建包结构
utils servlet service dao bean   
### 4.导入项目需要的jar，工具类，配置文件
- MySQL的Java驱动
- C3P0链接池
- DBUtils
- C3P0的配置文件
### 5.导入项目需要的静态文件
### 6.编写LoginServlet
			//获取用户名和密码
			//创建servlice并调用方法
			//判断用户输入的数据在数据库是否存在
				若存在：  xxx：欢迎回来
				若不存在：  登录失败
### 7.编写LoginService
			//创建LoginDao
			//调用dao中的方法
### 8.编写LoginDao
			//创建QueryRunner对象
			//编写sql
			//执行sql
