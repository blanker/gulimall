package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();
//        entity.setName("华为");
//        brandService.save(entity);

//        entity.setDescript("huawei");
//        entity.setBrandId(1L);
//        brandService.updateById(entity);

        Wrapper<BrandEntity> queryWrapper =
                new QueryWrapper<BrandEntity>().eq("brand_id", 1L);
        final List<BrandEntity> list = brandService.list(queryWrapper);
        list.forEach(System.out::println);
    }

}
