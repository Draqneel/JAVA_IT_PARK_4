<#ftl encoding='UTF-8'>
<#include "header.ftl">
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<!doctype html>
<html lang="en">
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="/js/main.js"></script>
    <meta charset="UTF-8">
    <title>Профиль</title>
    <style>
        a.button28 {
            left: 810px;
            position: relative;
            display: inline-block;
            font-size: 100%;
            font-weight: 700;
            color: rgb(209,209,217);
            text-decoration: none;
            text-shadow: 0 -1px 2px rgba(0,0,0,.2);
            padding: .5em 1em;
            outline: none;
            border-radius: 3px;
            background: linear-gradient(rgb(110,112,120), rgb(81,81,86)) rgb(110,112,120);
            box-shadow:
                    0 1px rgba(255,255,255,.2) inset,
                    0 3px 5px rgba(0,1,6,.5),
                    0 0 1px 1px rgba(0,1,6,.2);
            transition: .2s ease-in-out;
        }
        a.button28:hover:not(:active) {
            background: linear-gradient(rgb(126,126,134), rgb(70,71,76)) rgb(126,126,134);
        }
        a.button28:active {
            top: 1px;
            background: linear-gradient(rgb(76,77,82), rgb(56,57,62)) rgb(76,77,82);
            box-shadow:
                    0 0 1px rgba(0,0,0,.5) inset,
                    0 2px 3px rgba(0,0,0,.5) inset,
                    0 1px 1px rgba(255,255,255,.1);
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

        input[type=file] {
            padding:5px 15px;
            background:#ccc;
            border:0 none;
            cursor:pointer;
            -webkit-border-radius: 5px;
            border-radius: 5px;
        }
        .button {
            background-color: #4CAF50; /* Green */
            border: none;
            color: white;
            padding: 16px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            -webkit-transition-duration: 0.4s; /* Safari */
            transition-duration: 0.4s;
            cursor: pointer;
            border-radius: 5px
        }
        .button5 {
            background-color: white;
            color: black;
            border: 2px solid #555555;
        }

        .button5:hover {
            background-color: #555555;
            color: white;
        }
    </style>
</head>
<body>
<div>
    <h2>Здравствуйте, ${model.user.email}</h2>
  <!--<input type="file" name="file" id="fileInput" placeholder="Файл аватара"/>
    <button onclick="imageUpload(document.getElementById('fileInput')['files'][0])">Загрузить</button>
    <br>-->
    <table>
        <tr>
            <td><h3>Имя</h3></td>
            <td><h3>Фамилия</h3></td>
            <td><h3>Дата рождения</h3></td>
        </tr>
        <tr>
            <td><input type="text" id="name" <#if model.user.name??>
                       value="${model.user.name}"
            <#else>
                       placeholder="Не заполнено"
            </#if>></td>
            <td>
                <input type="text" id="lastName" <#if model.user.lastName??>
                       value="${model.user.lastName}"
                <#else>
                       placeholder="Не заполнено"
                </#if>>
            </td>
            <td><input type="text" id="birthDate" <#if model.user.birthDate??>
                       value="${model.user.birthDate}"
            <#else>
                       placeholder="Не заполнено"
            </#if>></td>
            <td><button class="button button5" onclick="updateUser(
        document.getElementById('name').value,
        document.getElementById('lastName').value,
        document.getElementById('birthDate').value
    )">Сохранить
            </button></td>
        </tr>
    </table>
   <!-- <input type="text" id="name" <#if model.user.name??>
        value="${model.user.name}"
    <#else>
           placeholder="Не заполнено"
    </#if>>
    <input type="text" id="lastName" <#if model.user.lastName??>
        value="${model.user.lastName}"
    <#else>
           placeholder="Не заполнено"
    </#if>>
    <input type="text" id="birthDate" <#if model.user.birthDate??>
        value="${model.user.birthDate}"
    <#else>
           placeholder="Не заполнено"
    </#if>>
    <button onclick="updateUser(
        document.getElementById('name').value,
        document.getElementById('lastName').value,
        document.getElementById('birthDate').value
    )">Сохранить
    </button>-->
    <div id="avatar">
        <#if model.user.imageUrl??>
            <img class="img-circle" width='100' height='100' src="${model.user.imageUrl}">
        </#if>
    </div>
</div>
<br><input type="file" name="file" id="fileInput" placeholder="Файл аватара"/>
<button class="button button5" onclick="imageUpload(document.getElementById('fileInput')['files'][0])">Загрузить</button>

<a href="/logout" class="button28">Выход</a>
</body>
</html>
