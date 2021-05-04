package nl.bioinf.wekainterface.model;

import weka.core.Instances;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface Reader {

    /**
     * Given an Arff file, read its contents and return a string with those contents
     */
    Instances readArff(String filename) throws IOException;

    /**
     * Given a CSV, convert the CSV file to an Arff file and save it to a directory.
     */
    void CsvToArff(String fileName) throws IOException;

    /**
     * Gets the names of all demo datasets that are included in WEKA
     * @return List of names
     */
    List<String> getDataSetNames();

    /**
     * Saves given file to a directory
     * @param file Arff file
     */
    void saveArff(File file) throws IOException;

    /**
     * Saves given instances in an Arff file to a destination
     * @param instances
     */
    void saveArff(Instances instances) throws IOException;
}

