# 过程笔记

> maven+springmvc+mybatis+vue练习。实现简单的功能。

## SpringMVC

1.新建一个webapp maven项目时，目录结构只包含了webapp,没有java和resources目录，需要新建，新建完成后需要标记这两个文件。

![](https://mdfileimg.oss-cn-beijing.aliyuncs.com/markdown_pic/20200626122647.png)

2.添加pom依赖

3.除了web.xml文件其他配置文件均在resources目录下

## 添加vue模块

> 提前安装vue插件

![](https://mdfileimg.oss-cn-beijing.aliyuncs.com/markdown_pic/20200626130812.png)

![image-20200626130912087](F:\Program Files\Typora\upload\image-20200626130912087.png)

相关命令

1.帮助

```bash
$ npm help
```

2.创建一个配置文件package.json（两种方式）:

```kotlin
 //1.一般情况下 一路enter
 $ npm init

 //2.全部使用默认配置
 $npm init --yes
```

3.安装模块（包）：

```cpp
//全局安装
$ npm install 模块名 -g
//本地安装
$ npm install 模块名
//一次性安装多个
$ npm install 模块1 模块2 模块n --save

//安装运行时依赖包
$ npm install 模块名 --save
//安装开发时依赖包
$ npm install 模块名 --save-dev
```

4.查看安装目录：

```cpp
//查看本地安装的目录
$ npm root

//查看全局安装的目录
$ npm root -g
```

5.卸载模块（包）：

```cpp
//卸载本地模块
$ npm uninstall 模块名

//卸载全局模块
$ npm uninstall -g 模块名
```

1. 更新模块（包）



```ruby
$ npm update 模块名

$ npm update 模块名 -g
```

6.查看当前安装的模块（包）

```ruby
$ npm ls

$ npm ls -g
```

7.查看模块（包）的信息：

```ruby
$ npm info 模块名
```

> package.json文件的配置说明：

```json
{
  "name": "blog",  //项目名称
  "version": "0.0.0",   //版本
  "description": "",   //项目描述
  "private": true,  
  "main": "index.js",  //入口文件
  "scripts": {   //配置一些通用的命令脚本
    "start": "node ./bin/www"
  },
  "keywords": [],  //项目的关键字
  "author": "",  //作者
  "dependencies": {   //开发时的依赖
    "body-parser": "~1.16.0",
    "cookie-parser": "~1.4.3",
    "debug": "~2.6.0",
    "ejs": "~2.5.5",
    "express": "~4.14.1",
    "morgan": "~1.7.0",
    "serve-favicon": "~2.3.2"
  },
  "devDependencies": {   //运行时的依赖
    "express-session": "^1.15.1"
  }
}
```

- 安装依赖包（两种情况）

```cpp
 //安装运行时依赖
 $ npm install 模块名 --save

 //安装开发时依赖
 $ npm install 模块名 --save-dev
```

- scripts配置可执行的命令，以 键值对 的方式配置，可配置多个

```bash
"script": {
    "命令": "执行代码",
    ...
}
```

- 执行配置的命令

```cpp
  //必须加run
  $ npm run 命令

  //特殊的命令 start 可不加run
  $ npm start 
  或
  $ npm run start
```

### 使用国内npm镜像源(3种方式)

1. 使用配置：

   ```bash
   $ npm config set registry 镜像源地址
   ```

2. 使用cnpm：

   

   ```cpp
   //先安装cnpm工具
   $ npm install -g cnpm --registry=镜像源地址
   //使用cnpm代替npm
   $ cnpm install 模块名
   ```

3. 使用nrm（推荐）：

   

   ```php
   //1.先安装nrm工具
   $ npm install -g nrm
   
   //2.查看当前可用的镜像源
   $ nrm ls
   
   //3.切换npm源
   $ nrm use 镜像源名称
   ```



### idea中的命令

![](https://mdfileimg.oss-cn-beijing.aliyuncs.com/markdown_pic/20200626132633.png)

## 前后端的分离

> 目前查找到的教程大部分时spring boot 与vue来实现前后端的分离

新建一个项目，将这里的spring改成spring boot，把这里的内容移植到新项目中。

看下一个项目：