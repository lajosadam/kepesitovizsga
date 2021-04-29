package hu.nive.ujratervezes.kepesitovizsga;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (contacts == null || output == null ) {
            throw new IllegalArgumentException();
        } else {
            directoryChecker(contacts,output);
        }
    }

    private void directoryChecker(Map<String, String> contacts,String output) throws IllegalArgumentException {
        File file = new File(output);

        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdir();
        }

        try {
            file.createNewFile();
            writeToFile(file,contacts);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void writeToFile(File file, Map<String, String> contacts) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), "utf-8"))) {
            for (Map.Entry<String, String> entry :
                    contacts.entrySet()) {

                writer.write(entry.getKey() + ": "
                        + entry.getValue());
                writer.newLine();
            }
        }


    }

}
