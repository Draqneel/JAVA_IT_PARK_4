<#import 'spring.ftl' as spring>
<@spring.bind 'model'/>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<h2>Вам подходят :</h2>
<table>
    <tr>
        <td>Название специальности</td>
        <td>ВУЗ</td>
        <td>Город</td>
        <td>Проходной балл</td>
    </tr>
<#list model.species as specie>
    <tr>
        <td>${specie.name}</td>
        <td>${specie.host}</td>
        <td>${specie.citizen}</td>
        <td>         ${specie.points}</td>
    </tr>
</#list>
</table>
</body>
</html>
