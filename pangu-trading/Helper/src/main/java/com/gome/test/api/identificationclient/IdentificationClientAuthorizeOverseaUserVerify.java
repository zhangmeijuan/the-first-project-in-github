package com.gome.test.api.identificationclient;

import org.testng.Assert;
import com.gome.test.utils.Logger;
import com.gome.test.api.adapter.IVerify;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component
@Lazy
public class IdentificationClientAuthorizeOverseaUserVerify extends IdentificationClientAuthorizeOverseaUserAdapter implements IVerify {

       public void verify(Object obj) {
             //TODO
       }
}

