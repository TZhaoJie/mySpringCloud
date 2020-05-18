package com.example.serviceconfig2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * JSON格式配置文件加载器  配置中心是ISO-8859-1编码的，实现PropertySourceLoader，设置读取为utf-8编码
 * 中文就不会乱码
 * @author 单红宇(CSDN CATOOP)
 * @create 2017年4月20日
 */
public class MyPropertiesHandler implements PropertySourceLoader {

    private Logger logger= LoggerFactory.getLogger(MyPropertiesHandler.class);

    @Override
    public String[] getFileExtensions() {
        return new String[]{"properties", "xml"};
    }

    @Override
    public List<PropertySource<?>> load(String name, Resource resource) throws IOException {
        Properties properties=new Properties();
        InputStream inputStream=null;
        try{
            inputStream=resource.getInputStream();
            properties.load(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        }catch (IOException ioEx){
            logger.error("load inputStream failed",ioEx);
            throw ioEx;
        }
        catch (Exception e){
            logger.error("load inputStream failed",e);
        }finally {
            if(inputStream!=null){
                inputStream.close();
            }
        }

        List<PropertySource<?>> propertySourceList=null;
        if (!properties.isEmpty()) {

            PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource(name, properties);
            propertySourceList=  new ArrayList<>();
            propertySourceList.add(propertiesPropertySource);
        }
        return  propertySourceList;

    }

}