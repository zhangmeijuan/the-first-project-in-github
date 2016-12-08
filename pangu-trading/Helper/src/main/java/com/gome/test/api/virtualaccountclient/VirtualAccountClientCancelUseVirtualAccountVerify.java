package com.gome.test.api.virtualaccountclient;

import org.testng.Assert;
import com.gome.test.utils.Logger;
import com.gome.test.api.adapter.IVerify;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component
@Lazy
public class VirtualAccountClientCancelUseVirtualAccountVerify extends VirtualAccountClientCancelUseVirtualAccountAdapter implements IVerify {

       public void verify(Object obj) {
             //TODO
       }
}

