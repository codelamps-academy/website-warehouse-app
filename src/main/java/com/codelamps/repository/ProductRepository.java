package com.codelamps.repository;

import com.codelamps.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 06/08/23
 * Time: 11.57
 * description: website-warehouse-smk-giripuro-sumpiuh
 */
public interface ProductRepository extends JpaRepository<Product, UUID> {
}
