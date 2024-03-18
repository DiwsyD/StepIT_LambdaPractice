# Lambda-вирази

- ### Для практики Lambda-виразів, Вам потрібно створити та налаштувати клас [Robot](src/main/java/org/stepIt/lambda/practice/robot/impl/Robot.java) у [Main](src/main/java/org/stepIt/lambda/practice/Main.java) класі.
- #### Ви можете скористатись внутрішнім класом [Builder](src/main/java/org/stepIt/lambda/practice/robot/impl/Robot.java) у класі [Robot](src/main/java/org/stepIt/lambda/practice/robot/impl/Robot.java).
- #### Кожен метод Білдера, приймає свій лямбда-вираз який представляє реалізацію певного методу (дії) робота.
- #### Також потрібно буде створити власний функціональний інтерфейс змінивши сигнатуру [CustomFunctionalInterfaceForLambda](src/main/java/org/stepIt/lambda/practice/custom/CustomFunctionalInterfaceForLambda.java) інтерфейсу, імплементувати його за допомогою лямбда-виразу і використавши його у класі [Robot](src/main/java/org/stepIt/lambda/practice/robot/impl/Robot.java).
##
- #### Або Ви можете скористатись конструктором класу [Robot](src/main/java/org/stepIt/lambda/practice/robot/impl/Robot.java) та передати набір лямбда-виразів.
- #### У Класі [Main](src/main/java/org/stepIt/lambda/practice/Main.java) також представлено код для використання створеного та налаштованого класу [Robot](src/main/java/org/stepIt/lambda/practice/robot/impl/Robot.java).