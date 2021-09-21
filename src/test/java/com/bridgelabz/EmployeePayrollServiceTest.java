package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class EmployeePayrollServiceTest {
private static String HOME= System.getProperty("user.home");
private static String PLAY_WITH_NIO ="TeamPlayGround";

    @Test
    void givenPathWhenCheckedThenConfirm() throws IOException {
        //CHECK FILE EXISTS
        Path homePath= Paths.get(HOME);
        Assertions.assertTrue(Files.exists(homePath));

        //DELETE FILE AND CHECK FILE NOT EXIST
        Path playPath = Paths.get(HOME+"/"+PLAY_WITH_NIO);
        if(Files.exists(playPath)) FileUtils.deleteFiles(playPath.toFile());
        Assertions.assertTrue(Files.notExists(playPath));

        //CREATE DIRECTORY
        Files.createDirectories(playPath);
        Assertions.assertTrue(Files.exists(playPath));

        //CREATE FILE
        IntStream.range(1,10).forEach(cntr->{
            Path tempFile = Paths.get(playPath+"/temp"+cntr);
            Assertions.assertTrue(Files.notExists(tempFile));
            try{Files.createFile(tempFile);} catch (IOException e) {
                e.printStackTrace();
            }Assertions.assertTrue(Files.exists(tempFile));
        });

        //LIST FILES ,DIRECTORIES AS WELL AS  FILES WITH EXTENSION
        Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
        Files.newDirectoryStream(playPath).forEach(System.out::println);
        Files.newDirectoryStream(playPath,path->path.toFile().isFile()&&path.toString().startsWith("temp")).forEach(System.out::println);
    }
}