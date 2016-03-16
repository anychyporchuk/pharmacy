# pharmacy
 База для веб-приложения аптеки. Содержит минимальный функционал. Задействованы такие инструменты, как Hibernate, Spring.
 Позволяет вывести все доступные медикаменты и поставки, а а также добавить медикамент.
 
 Порядок установки
 1. Создать базу данных mysql с именем pharmacy.
 2. Создать пользователя базы
  CREATE USER pharmacy@localhost identified BY '1234';
  GRANT usage ON *.* TO pharmacy@localhost identified BY '1234';
  GRANT ALL privileges ON contactmanager.* TO contactmanager@localhost;
 3. Запустить приложение. После запуска таблицы должны автоматически создаться.
 4. Заполнить таблицы. Файл для заполнения pharmacy/src/main/resources/filltables.
 
