/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknotera.testdocuments2j;

import com.documents4j.api.DocumentType;
import com.documents4j.api.IConverter;
import com.documents4j.job.LocalConverter;
import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Heru
 */
public class Main {
    
    public static void main(String[] args) {
        
//        IConverter converter = RemoteConverter.builder()
//                           .baseFolder(new File("C:\\Users\\Heru\\temp"))
//                           .workerPool(20, 25, 2, TimeUnit.SECONDS)
//                           .requestTimeout(10, TimeUnit.SECONDS)
//                           .baseUri("http://localhost:9998")
//                           .build();
        
        IConverter converter = LocalConverter.builder()
                           .baseFolder(new File("C:\\Users\\Heru\\temp"))
                           .workerPool(20, 25, 2, TimeUnit.SECONDS)
                           .processTimeout(5, TimeUnit.SECONDS)
                           .build();
        
        converter
            .convert(new File("C:\\Users\\Heru\\Documents\\Alami-Docs\\Lender-Poa.docx"))
            .as(DocumentType.DOCX)
            .to(new File("C:\\Users\\Heru\\Documents\\Alami-Docs\\Lender-Poa-documents4j.pdf"))
            .as(DocumentType.PDF)
            .execute();

        converter
            .convert(new File("C:\\Users\\Heru\\Documents\\Alami-Docs\\Lender-Aggrement.docx"))
            .as(DocumentType.DOCX)
            .to(new File("C:\\Users\\Heru\\Documents\\Alami-Docs\\Lender-Aggrement-documents4j.pdf"))
            .as(DocumentType.PDF)
            .execute();

        converter
            .convert(new File("C:\\Users\\Heru\\Documents\\Alami-Docs\\Lender-Waad.docx"))
            .as(DocumentType.DOCX)
            .to(new File("C:\\Users\\Heru\\Documents\\Alami-Docs\\Lender-Waad-documents4j.pdf"))
            .as(DocumentType.PDF)
            .execute();

        converter
            .convert(new File("C:\\Users\\Heru\\Documents\\Alami-Docs\\Lender-Waad-T-2.docx"))
            .as(DocumentType.DOCX)
            .to(new File("C:\\Users\\Heru\\Documents\\Alami-Docs\\Lender-Waad-T-2-documents4j.pdf"))
            .as(DocumentType.PDF)
            .execute();
        
        converter.shutDown();
        
    }
    
}
