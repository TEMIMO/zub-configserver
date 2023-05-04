# Config-server

### Documentation

Для запуска требуется наличие java 8, maven, docker

Чтобы развернуть приложение в контейнере:
1. Собрать jar
2. Сборка образа: docker build --build-arg JAR_FILE=target/*.jar -t zub-configserver-image-tag .
3. Запуск контейнера: docker run -p 8888:8888 --name zub-configserver-name 54d22a8f176a 



