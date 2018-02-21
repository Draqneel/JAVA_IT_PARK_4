<#ftl encoding='UTF-8'>
<#include "header.ftl">
<html>
<head>
    <style type="text/css">
        .form form {
            width: 300px;
            margin: 0 auto;
            padding-top: 20px;
        }
        input[type=text] {
            padding:5px;
            border:2px solid #ccc;
            -webkit-border-radius: 5px;
            border-radius: 5px;
        }

        input[type=text]:focus {
            border-color:#333;
        }

        input[type=password] {
            padding:5px;
            border:2px solid #ccc;
            -webkit-border-radius: 5px;
            border-radius: 5px;
        }

        input[type=password]:focus {
            border-color:#333;
        }

        input[type=submit] {
            padding:5px 15px;
            background:#ccc;
            border:0 none;
            cursor:pointer;
            -webkit-border-radius: 5px;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<div><h1 align="center" >Регистрация</h1></div>
<div class="form">
    <form class="form-horizontal" role="form" method="post" action="/signUp">
        <div class="form-group">
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">Логин</label>
                <div class="col-sm-10">
                    <input type="text" name="email" placeholder="E-mail">
                </div>
            </div>
            <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">Пароль</label>
                <div class="col-sm-10">
                    <input type="password" name="password" placeholder="Пароль">
                </div>
            </div>
            <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">Пароль</label>
                <div class="col-sm-10">
                    <input type="password" name="repassword" placeholder="Повторите">
                </div>
            </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit">
                </div>
            </div>
    </form>
<div id="vk_form">

</div>
</body>
</html>