FROM java:8-alpine

COPY target/uberjar/luminus-cats.jar /luminus-cats/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/luminus-cats/app.jar"]
