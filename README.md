
### Axon server

```
$ docker run -d --name axonserver -p 8024:8024 -p 8124:8124 -v "D://Workspaces//targets//udemy//event-driven//AxonServer//data"://data -v "D://Workspaces//targets//udemy//event-driven//AxonServer//eventdata"://eventdata -v "D://Workspaces//targets//udemy//event-driven//AxonServer//config"://config axoniq/axonserver
```

### References

[Spring Tools 4](https://spring.io/tools)
[Spring Initializr](https://start.spring.io/)
[Axon Server](https://developer.axoniq.io/axon-server/overview)
[Axon Image for Docker Hub](https://hub.docker.com/r/axoniq/axonserver)
[Axon properties](https://docs.axoniq.io/reference-guide/axon-server/administration/admin-configuration/configuration#configuration-properties)
[Lombok plugins](https://polinwei.com/lombok-install-in-eclipse/)
[Mvn repositories (axon-spring-boot-starter)](https://mvnrepository.com/artifact/org.axonframework/axon-spring-boot-starter/4.5.9)
[Hibernate Validator](http://hibernate.org/validator/)