package com.example.fuck.Controller;

import com.example.fuck.Pojo.PackageRequest.UserAddReq;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/record",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
public class NewController {
    @RequestMapping(value = "/userSelect",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public String userSelect(@RequestBody UserAddReq userAddReq )
    {
        //获取了body数据 放到outputRequest 里面
        UserAddReq useraddreq=new UserAddReq();


        return  userAddReq.getName();
    }

}
