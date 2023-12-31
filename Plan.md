# План автоматизации тестирования

## Сценарии навигации

### Сценарий №1 "Оплата тура с активной банковской карты":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить`.
4. В поле `Номер карты` ввести данные `1111 2222 3333 4444`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1465" alt="SCR-20230802-pltf" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/ef75832e-232e-4fd2-a74b-d061e980d762">

10.  Ожидаемый результат: откроется страница для введения кода подтверждения из смс-сообщения или push-уведомления.
  
### Сценарий №2 "Оплата тура с неактивной банковской карты":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить`.
4. В поле `Номер карты` ввести данные `5555 6666 7777 8888`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1463" alt="SCR-20230802-pmww" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/3622d644-0453-429a-8e13-8ad9566ecbbf">

10.  Ожидаемый результат: появится валидационное сообщение "Данная карта не активна, попробуйте ввести другие данные".
   
### Сценарий №3 "Покупка тура в кредит с активной банковской карты":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить в кредит`.
4. В поле `Номер карты` ввести данные `1111 2222 3333 4444`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1464" alt="SCR-20230802-poiw" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/c41fce3e-a02a-4282-976b-ee49ee2b0eaa">

10.  Ожидаемый результат: откроется страница для введения кода подтверждения из смс-сообщения или push-уведомления.
  
### Сценарий №4 "Покупка тура в кредит с неактивной банковской карты":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить в кредит`.
4. В поле `Номер карты` ввести данные `5555 6666 7777 8888`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1461" alt="SCR-20230802-ppga" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/d59011c8-40ac-412b-b27e-f5e7bae5cc8d">

10.  Ожидаемый результат: появится валидационное сообщение "Данная карта не активна, попробуйте ввести другие данные".

### Сценарий №5 "Оплата тура с банковской карты с несуществующим номером":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить`.
4. В поле `Номер карты` ввести данные `0000 0000 0000 0000`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1461" alt="SCR-20230803-kxhb" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/44abdd99-2a12-4413-94bb-b96782327aa2">

10.  Ожидаемый результат: появится валидационное сообщение "Данная карта не активна, попробуйте ввести другие данные".

### Сценарий №6 "Оплата тура с банковской карты с несуществующим месяцем":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить`.
4. В поле `Номер карты` ввести данные `1111 2222 3333 4444`.
5. В поле `Месяц` ввести данные `88`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1463" alt="SCR-20230803-kzqa" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/49781952-dacf-498d-a122-d6ef6ea0ab1f">

10.  Ожидаемый результат: под полем `Месяц`появится валидационное сообщение "Неверно указан срок действия карты".

### Сценарий №7 "Оплата тура с банковской карты с прошедшим годом":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить`.
4. В поле `Номер карты` ввести данные `1111 2222 3333 4444`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `21`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1466" alt="SCR-20230803-lcgt" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/9b22bc29-b7bf-433f-bd94-e4d960031e1f">

10.  Ожидаемый результат: под полем `Год`появится валидационное сообщение "Истёк срок действия карты".

### Сценарий №8 "Оплата тура с банковской карты с некорректным будущим годом":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить`.
4. В поле `Номер карты` ввести данные `1111 2222 3333 4444`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `99`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1467" alt="SCR-20230803-mbcl" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/03f0e803-a7e5-44f4-b44d-27ebf81b1ee3">

10.  Ожидаемый результат: под полем `Год`появится валидационное сообщение "Неверно указан срок действия карты".

### Сценарий №9 "Оплата тура с банковской карты с именем на кириллице":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить`.
4. В поле `Номер карты` ввести данные `1111 2222 3333 4444`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Петрова Яна`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1465" alt="SCR-20230803-ldrw" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/203f641a-c8a9-4e54-9151-d98756d274ac">

10.  Ожидаемый результат: поле `Владелец`не принимает символы на кириллице и под полем появится валидационное сообщение "Данные введены в неверном формате".

### Сценарий №10 "Оплата тура с активной банковской карты с кодом 000":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить`.
4. В поле `Номер карты` ввести данные `1111 2222 3333 4444`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `000`.
9. Нажать на кнопку `Продолжить`.

<img width="1464" alt="SCR-20230803-lidy" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/42c3ca60-5021-4403-905e-5e80e848a121">

10. Ожидаемый результат: откроется страница для введения кода подтверждения из смс-сообщения или push-уведомления.

### Сценарий №11 "Оплата тура с банковской карты без номера":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить`.
4. В поле `Номер карты` ввести данные ``.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1467" alt="SCR-20230803-lkzc" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/2343b0da-c7a4-4db8-ae55-9990dda30ca4">

10. Ожидаемый результат: под полем `Номер карты` появится валидационное сообщение "Обязательное поле".

### Сценарий №12 "Покупка тура в кредит с банковской карты с несуществующим номером":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить в кредит`.
4. В поле `Номер карты` ввести данные `0000 0000 0000 0000`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1461" alt="SCR-20230803-lqyv" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/63abf31a-1d73-4666-a96d-dad04c918195">

10.  Ожидаемый результат: появится валидационное сообщение "Данная карта не активна, попробуйте ввести другие данные".

### Сценарий №13 "Покупка тура в кредит с банковской карты с несуществующим месяцем":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить в кредит`.
4. В поле `Номер карты` ввести данные `1111 2222 3333 4444`.
5. В поле `Месяц` ввести данные `99`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1466" alt="SCR-20230803-lsze" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/ca1cb2ed-c9d4-494a-a4ac-77717ea43049">

10.  Ожидаемый результат: под полем `Месяц`появится валидационное сообщение "Неверно указан срок действия карты".

### Сценарий №14 "Покупка тура в кредит с банковской карты с прошедшим годом":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить в кредит`.
4. В поле `Номер карты` ввести данные `1111 2222 3333 4444`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `21`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1464" alt="SCR-20230803-lulo" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/c4435710-068c-4372-b56b-33ae90ce4464">

10.  Ожидаемый результат: под полем `Год`появится валидационное сообщение "Истёк срок действия карты".

### Сценарий №15 "Покупка тура в кредит с банковской карты с некорректным будущим годом":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить в кредит`.
4. В поле `Номер карты` ввести данные `1111 2222 3333 4444`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `99`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.
    
<img width="1468" alt="SCR-20230803-mcpj" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/bb202de5-a3bd-4961-a232-94922d014dde">

10.  Ожидаемый результат: под полем `Год`появится валидационное сообщение "Неверно указан срок действия карты".

### Сценарий №16 "Покупка тура в кредит с банковской карты с именем на кириллице":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить в кредит`.
4. В поле `Номер карты` ввести данные `1111 2222 3333 4444`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Петрова Яна`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1464" alt="SCR-20230803-lvzb" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/cdcb0d2b-098e-4e9a-a225-a5b536ae38ae">

10.  Ожидаемый результат: поле `Владелец`не принимает символы на кириллице и под полем появится валидационное сообщение "Данные введены в неверном формате".

### Сценарий №17 "Покупка тура в кредит с банковской карты с кодом 000":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить в кредит`.
4. В поле `Номер карты` ввести данные `1111 2222 3333 4444`.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `000`.
9. Нажать на кнопку `Продолжить`.

<img width="1467" alt="SCR-20230803-lxoq" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/16ad3cb3-8278-4261-b4e0-a97bc1e18656">

10.  Ожидаемый результат: откроется страница для введения кода подтверждения из смс-сообщения или push-уведомления.

### Сценарий №18 "Покупка тура в кредит с банковской карты без номера":
1. Открыть [jar-файл](https://github.com/dnatali2211/last_project_mysql/blob/main/artifacts/aqa-shop.jar) в IDEA.
2. В браузере открыть http://localhost:8080/.
3. На главной странице нажать на кнопку `Купить в кредит`.
4. В поле `Номер карты` ввести данные ``.
5. В поле `Месяц` ввести данные `01`.
6. В поле `Год` ввести данные `24`.
7. В поле `Владелец` ввести данные `Petrova Yana`.
8. В поле `CVC/CVV` ввести данные `879`.
9. Нажать на кнопку `Продолжить`.

<img width="1467" alt="SCR-20230803-lzgg" src="https://github.com/dnatali2211/last_project_mysql/assets/127582824/15d9721e-47e0-4854-9908-07da1462bd9a">

10.  Ожидаемый результат: под полем `Номер карты` появится валидационное сообщение "Обязательное поле".


## Используемые инструменты

1. Среда разработки: IntelliJ IDEA, предоставляет богатый функционал для разработки и отладки Java-кода, предоставляет интеллектуальные подсказки и автодополнение кода, имеет интеграцию с системами контроля версий, что упрощает работу с кодом из репозиториев.
2. Браузер Chrome: обладает хорошей производительностью и стабильностью, что важно при выполнении автоматизированных тестов, а также имеет богатый набор инструментов разработчика (DevTools) для анализа и отладки веб-страниц.
3. Язык программирования Java,так как он предоставляет богатый выбор библиотек для автоматизации тестирования и имеет простой синтаксис.
4. Gradle: позволяет управлять зависимостями проекта, что упрощает установку и подключение необходимых библиотек и фреймворков.
Обладает гибкими возможностями для конфигурации сборки проекта. Имеет хорошую поддержку интеграции с другими инструментами и CI системами.
5. Контейнер MySQL на платформе Docker - создание, запуск и остановка контейнера MySQL выполняются с помощью нескольких команд Docker, что упрощает управление базой данных.
6. Фреймворк для юнит-тестирования JUnit: обеспечивает удобное написание и организацию тестовых сценариев. Предоставляет удобные методы для проверки ожидаемых результатов тестов.
7. Фреймворк для автоматизации Selenium WebDriver: позволяет выполнять различные действия с элементами страницы, взаимодействуя с ними как пользователь.
8. Faker: упрощает создание тестовых данных, включая случайные или заполненные тестовыми значениями поля формы. Помогает сгенерировать разнообразные тестовые данные для проверки различных сценариев.
9. Lombok: улучшает читаемость и поддерживаемость кода.
10. GitHub: обеспечивает централизованное хранение и контроль версий кода, что позволяет легко совместно работать над проектом. Предоставляет возможность отслеживать изменения, создавать задачи и исправлять ошибки через pull requests, создавать issue при обнаружении багов. Имеет возможности для автоматической интеграции с CI системами и автоматического запуска тестов при изменении кода.

## Необходимые разрешения

Необходимо получить разрешения владельцев сайта на проведение тестирования.
Доступ к тестовой базе данных.
Разрешение на создание и удаление тестовых данных.

## Возможные риски при автоматизации

Отсутствие тестовых меток в селекторах.
Частое обновление интерфейса.

## Необходимые специалисты

Автотестировщик.

## Интервальная оценка с учётом рисков в часах

При наличии рисков, указанных в разделе `Возможные риски при автоматизации`, необходимое количество рабочих часов - 80.
При их отсутствии - 48 рабочих часа.
