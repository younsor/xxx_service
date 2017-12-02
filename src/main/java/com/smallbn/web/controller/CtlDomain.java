package com.smallbn.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import com.smallbn.web.comm.JsonResult;
import com.smallbn.web.dto.DtoDomain;
import com.smallbn.web.service.SrvDomain;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
@RequestMapping(value = "/domain", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CtlDomain extends CtlBase
{
    @Autowired
    private SrvDomain srvDomain;

    @PostMapping(value = { "", "/" })
    public JsonResult postSaveArticle(String domain)
    {
        DtoDomain dtoDomain = srvDomain.getDomainInfo(domain);

        return rspSuccess(dtoDomain);
    }
}
