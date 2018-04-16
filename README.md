# Spring Boot API with Angular UI
 
This example app shows how to create a Spring Boot API and display its data with an Angular UI.

Please read [Bootiful Development with Spring Boot and Angular](https://developer.okta.com/blog/2017/04/26/bootiful-development-with-spring-boot-and-angular) to see how this app was created. You can also watch [this screencast on YouTube](https://www.youtube.com/watch?v=bUq83Rz4BHA).

<a href="https://www.youtube.com/watch?v=bUq83Rz4BHA"><img src="https://i.ytimg.com/vi/bUq83Rz4BHA/maxresdefault.jpg" alt="Bootiful Development with Spring Boot and Angular" width="560"></a>

**Prerequisites:** [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and [Node.js](https://nodejs.org/).

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage and secure users and roles in any application.

* [Getting Started](#getting-started)
* [Help](#help)
* [License](#license)

## Getting Started

To install this example application, run the following commands:

```bash
git clone https://github.com/oktadeveloper/spring-boot-angular-example.git
cd spring-boot-angular-example
```

This will get a copy of the project installed locally. To install all of its dependencies and start each app, follow the instructions below.

To run the server, cd into the `server` folder and run:
 
```bash
./mvnw spring-boot:run
```

To run the client, cd into the `client` folder and run:
 
```bash
npm install && npm start
```

## Help

Please post any questions as comments on the [blog post](https://developer.okta.com/blog/2017/04/26/bootiful-development-with-spring-boot-and-angular), or visit our [Okta Developer Forums](https://devforum.okta.com/). You can also email developers@okta.com if would like to create a support ticket.

## License

Apache 2.0, see [LICENSE](LICENSE).
