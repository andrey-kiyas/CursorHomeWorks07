# Cursor: "Homework 07" (Andrey Kiyas)
___
### Git link(s):
- [Pull request 01 (Part 01) - HW](https://github.com/andrey-kiyas/CursorHomeWorks07/pull/1)
- [Pull request 02 (Part 02) - Servlet](https://github.com/andrey-kiyas/CursorHomeWorks07/pull/2)
___
### EN
1) Create a spring boot “Shops” project.
   Create a store model, the class should have the following fields: ID, city and street where the store is located, the name of the store and the number of employees, and the field whether the store has a website.
   Create a controller in which the following operations will be present:
    - create a new store,
    - delete the store (in English),
    - get a list of all stores,
    - to get a store in Idaishka
    - change the fields of the store (by Aidaishka) – you can change all fields except Aidaishka.

   Check the functionality through postman, idea or any other tool. Make sure CRUD operations work. Instead of a database, use any collection, it is desirable to perform all operations in a separate service that will be present in the controller.


2) "Optional" Specify the status code, for example, after creating a store, return not 200 code but 201 Created. If a shop that does not exist is requested, return 404 and add a meaningful message about the rest - an error.


3) "Optional" Download tomcat and implement the servlet. It will accept two parameters name, mood of the person and header “place” and will return the message “Hi + name from + place, you are felling + mood”.
___
### UA
1) Створити spring boot проект “Shops”.
   Створити модель магазину, в класі мають бути такі поля :айді, місто та вулиця де знаходиться магазин, назва магазину і кількість співробітників, та поле чи є у магазина сайт.
   Створити контролер в якому будутьприсутні такі операції :
   - створити новий магазин,
   - видалити магазин (по айдішці),
   - отримати список всіх магазинів,
   - отримати магазин по  айдішці
   - змінти поля магазину (по айдішці) – можна міняти всі поля крім айдішки.

   Перевірити функціонал через постман, ідею чи будь яку іншу тулзовину. Впевнетись що CRUD операції працюють. Замість бази данних використати будь яку колекцію, бажано всі операції зробити в окремому сервісі який буде присутній в контролері.


2) "Опційно" Конкретизувати статус коди, наприклад після створення магазину повертати не 200 код а 201 Created. Якщо запитується шоп якого немає повернути 404, і додати осмислене повідомленя про рест - помилку.


3) "Опційно"  Завантажити tomcat, та реалізувати сервлет. Він буде приймати два параметри ім’я, настрій людини та  хедер “place” і буде повертати повідомлення “Hi + name from + place, you are felling + настрій”.
---