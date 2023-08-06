package com.codelamps.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 06/08/23
 * Time: 15.34
 * description: website-warehouse-smk-giripuro-sumpiuh
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private UUID id;

    private String nameProduct;

    private int quantityProduct;
}
