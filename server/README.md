## Spring Boot with Stormpath

If you already have Stormpath configured, you should be able to start this app with `mvn spring-boot:run`. 

See instructions below if you don't have a Stormpath account.

## Stormpath Setup

The [Stormpath Spring Boot Quickstart](https://docs.stormpath.com/java/spring-boot-web/quickstart.html) shows how to create a Stormpath account and download an API key; here’s the abridged version:

1. Signup for a free Stormpath developer account at https://api.stormpath.com/register.
2. From the Home tab of the Admin Console select Manage API Keys under the Developer Tools heading.
3. Click the Create API Key button to trigger a download of a apiKey-{API_KEY}.properties file.
4. Move the file to `~/.stormpath/apiKey.properties`.

