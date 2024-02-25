Проект "Учебная группа"

Структура MVSC-паттерна.

1. Controller - модуль взаимодействия с пользователем (ввод/вывод):
   Класс controller - основной контроллер взаимодействия с model.
2. Model - содержит в себе родительский класс User, от которого наследуются классы Student и Teacher.
3. Service - модуль, содержащий в себе интерфейсы StudentService и TeacherService, 
от которых, соответственно имплетементируются классы DataStudentService и DataTeacherService для создания и получения информации о студенте и учителе.
4. View - отображение списка всех студентов, получаемых из модуля Controller 

SOLID

1. Single responsibility principle соблюдается, так как каждый класс специализируется конкретно на своей задаче.  
Так,например, DataStudentService реализовывает создание студента в списке всех студентов и ,в случае чего, получение этого списка.
2. Open-closed principle. Классы Student и Teacher могут быть расширены в случае появления новой информации об их личности.
3. Liskov substitution principle. Классы Student  и Teacher могут быть использованы вместо своего родительского класса User.
4. interface segregation principle. Интерфейсы StudentService и TeacherService созданы под разные задачи.
