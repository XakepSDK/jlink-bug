package dk.xakeps.testload;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new URL("https://launchermeta.mojang.com/v1/packages/fd990561a3502903a819815ca63b7ac13110a84c/21w44a.json").openStream();
        System.out.println(new String(inputStream.readAllBytes(), StandardCharsets.UTF_8));
    }
}
