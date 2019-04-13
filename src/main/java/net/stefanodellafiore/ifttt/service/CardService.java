package net.stefanodellafiore.ifttt.service;

import net.stefanodellafiore.ifttt.model.CrdsvcInlineResponse2001;
import net.stefanodellafiore.ifttt.model.CrdsvcInlineResponse2001Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

@Component
public class CardService {
    private Map<String,CrdsvcInlineResponse2001> storage = new HashMap<>();

    public CrdsvcInlineResponse2001 getCardsForUser(@NotNull String user){
        return storage.computeIfAbsent(user, (u)->{
            CrdsvcInlineResponse2001 data = new CrdsvcInlineResponse2001();

            for (int i = 0; i < 3; i++) {
                CrdsvcInlineResponse2001Data item = new CrdsvcInlineResponse2001Data();
                item.setLabel("419500xxxxxx"+((int)Math.random()*10000));
                item.setValue(item.getLabel());
                data.addDataItem(item);
            }
            return data;
        });
    }

}
