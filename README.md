# springboot-customize-status-code

Question refer to [here](https://stackoverflow.com/questions/46283086/spring-boot-request-hang-there-when-return-1xx-status-code)

## How to run the demo

```
./gradlew bootRun
```

## Scenario

In the `DemoController`,

1. if I return non-standard status equal or greater than 200, everything works;

2. if I return status below less than 200, no one works.

## How to reproduce

After you start the demo with `./gradlew bootRun`,
visit [http://localhost:8080/hello](http://localhost:8080/hello) in the browser
or test it in the commandline with `curl -v http://localhost:8080/hello`
