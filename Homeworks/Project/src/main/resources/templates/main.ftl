<#ftl encoding='UTF-8'>
<#include "header.ftl">
<#import 'spring.ftl' as spring>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            /*border: 1px solid #dddddd */;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
        input[type=number] {
            padding:5px;
            border:2px solid #ccc;
            -webkit-border-radius: 5px;
            border-radius: 5px;
        }

        input[type=number]:focus {
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
        .box_1{
            background: #eee;
        }

        input[type="checkbox"].switch_1{
            font-size: 30px;
            -webkit-appearance: none;
            -moz-appearance: none;
            appearance: none;
            width: 3.5em;
            height: 1.5em;
            background: #ddd;
            border-radius: 3em;
            position: relative;
            cursor: pointer;
            outline: none;
            -webkit-transition: all .2s ease-in-out;
            transition: all .2s ease-in-out;
        }

        input[type="checkbox"].switch_1:checked{
            background: #0ebeff;
        }

        input[type="checkbox"].switch_1:after{
            position: absolute;
            content: "";
            width: 1.5em;
            height: 1.5em;
            border-radius: 50%;
            background: #fff;
            -webkit-box-shadow: 0 0 .25em rgba(0,0,0,.3);
            box-shadow: 0 0 .25em rgba(0,0,0,.3);
            -webkit-transform: scale(.7);
            transform: scale(.7);
            left: 0;
            -webkit-transition: all .2s ease-in-out;
            transition: all .2s ease-in-out;
        }

        input[type="checkbox"].switch_1:checked:after{
            left: calc(100% - 1.5em);
        }

        /* switch2 */
        .box_1{
            background: #eee;
        }

        input[type="checkbox"].switch_2{
            font-size: 30px;
            -webkit-appearance: none;
            -moz-appearance: none;
            appearance: none;
            width: 3.5em;
            height: 1.5em;
            background: #fff;
            border-radius: 3em;
            position: relative;
            cursor: pointer;
            outline: none;
            -webkit-transition: all .2s ease-in-out;
            transition: all .2s ease-in-out;
        }

        input[type="checkbox"].switch_2:checked{
            background: #0ebeff;
        }

        input[type="checkbox"].switch_2:after{
            position: absolute;
            content: "";
            width: 1.5em;
            height: 1.5em;
            border-radius: 50%;
            background: #fff;
            -webkit-box-shadow: 0 0 .25em rgba(0,0,0,.3);
            box-shadow: 0 0 .25em rgba(0,0,0,.3);
            -webkit-transform: scale(.7);
            transform: scale(.7);
            left: 0;
            -webkit-transition: all .2s ease-in-out;
            transition: all .2s ease-in-out;
        }

        input[type="checkbox"].switch_2:checked:after{
            left: calc(100% - 1.5em);
        }
    </style>
</head>
<body>
<form action="/main" method="post">
    <table cellspacing="5" cellpadding="10">
        <tr>
            <td><h3>Русский язык</h3></td>
            <td><input type="checkbox" name="sc01" placeholder="Запомнить" class="switch_1"></td>
            <td><input type="number" name="valueOfSc01" placeholder="От 34"></td>
        </tr>
        <tr>
            <td><h3>Математика</h3></td>
            <td><input type="checkbox" name="sc02" placeholder="Запомнить" class="switch_2"></td>
            <td><input type="number" name="valueOfSc02" placeholder="От 27"></td>
        </tr>
        <tr>
            <td><h3>Иностранный язык</h3></td>
            <td><input type="checkbox" name="sc03" placeholder="Запомнить" class="switch_1"></td>
            <td><input type="number" name="valueOfSc03" placeholder="От 22"></td>
        </tr>
        <tr>
            <td><h3>Информатика</h3></td>
            <td><input type="checkbox" name="sc04" placeholder="Запомнить" class="switch_2"></td>
            <td><input type="number" name="valueOfSc04" placeholder="От 40"></td>
        </tr>
        <tr>
            <td><h3>Биология</h3></td>
            <td><input type="checkbox" name="sc05" placeholder="Запомнить" class="switch_1"></td>
            <td><input type="number" name="valueOfSc05" placeholder="От 36"></td>
        </tr>
        <tr>
            <td><h3>География</h3></td>
            <td><input type="checkbox" name="sc06" placeholder="Запомнить" class="switch_2"></td>
            <td><input type="number" name="valueOfSc06" placeholder="От 40"></td>
        </tr>
        <tr>
            <td><h3>Химия</h3></td>
            <td><input type="checkbox" name="sc07" placeholder="Запомнить" class="switch_1"></td>
            <td><input type="number" name="valueOfSc07" placeholder="От 36"></td>
        </tr>
        <tr>
            <td><h3>Физика</h3></td>
            <td><input type="checkbox" name="sc08" placeholder="Запомнить" class="switch_2"></td>
            <td><input type="number" name="valueOfSc08" placeholder="От 36"></td>
        </tr>
        <tr>
            <td><h3>Литература</h3></td>
            <td><input type="checkbox" name="sc09" placeholder="Запомнить"
                       class="switch_1"></td>
            <td><input type="number" name="valueOfSc09" placeholder="От 32"></td>
        </tr>
        <tr>
            <td><h3>История</h3></td>
            <td><input type="checkbox" name="sc10" placeholder="Запомнить"
                       class="switch_2"></td>
            <td><input type="number" name="valueOfSc10" placeholder="От 29"></td>
        </tr>
        <tr>
            <td><h3>Обществознание</h3></td>
            <td><input type="checkbox" name="sc11" placeholder="Запомнить" class="switch_1"></td>
            <td><input type="number" name="valueOfSc11" placeholder="От 42"></td>
        </tr>
        <tr>
            <td><h3>Внутренний экзамен</h3></td>
            <td><input type="checkbox" name="sc12" placeholder="Запомнить" class="switch_2"></td>
            <td><input type="number" name="valueOfSc12" placeholder="0"></td>
        </tr>
        <tr>
            <input type="submit">
        </tr>
    </table>
</form>
</body>
</html>