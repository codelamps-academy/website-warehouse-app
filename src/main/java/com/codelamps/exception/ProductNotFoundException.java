package com.codelamps.exception;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 06/08/23
 * Time: 15.02
 * description: website-warehouse-smk-giripuro-sumpiuh
 */

public class ProductNotFoundException extends Exception{

    private static final long serialVersionUID = 1L;

    public ProductNotFoundException(){
        super("Product Not Found Exception");
    }

    public ProductNotFoundException(String message){
        super(message);
    }
}
