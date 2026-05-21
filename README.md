# Arquillian Jetty Examples

Example projects demonstrating [Arquillian](https://arquillian.org/) with the Jetty 11 embedded container across different test frameworks.

## Modules

| Module | Test Framework | Arquillian Integration |
|--------|---------------|----------------------|
| `junit4/` | JUnit 4 | `@RunWith(Arquillian.class)` |
| `junit-jupiter/` | JUnit Jupiter (5) | `@ExtendWith(ArquillianExtension.class)` |

## Prerequisites

- Java 11+

## Running the Tests

```bash
./mvnw verify --file junit4/pom.xml
./mvnw verify --file junit-jupiter/pom.xml
```

### Override the Arquillian version

```bash
./mvnw verify --file junit4/pom.xml -Dversion.arquillian=<version>
./mvnw verify --file junit-jupiter/pom.xml -Dversion.arquillian=<version>
```

## License

Source codes released under [DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE](http://www.wtfpl.net/).
