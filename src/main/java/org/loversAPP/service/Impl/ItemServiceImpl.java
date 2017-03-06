package org.loversAPP.service.Impl;

import org.loversAPP.dao.ItemMapper;
import org.loversAPP.dao.UserItemMapper;
import org.loversAPP.model.Item;
import org.loversAPP.model.UserItem;
import org.loversAPP.model.UserItemExample;
import org.loversAPP.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/6.
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private UserItemMapper userItemMapper;
    @Override
    public Integer insertItem(String itemName, String itemFunction, Long price, String itemImage,Integer itemType) {
        Item item=new Item();
        item.setItemname(itemName);
        item.setItemfunction(itemFunction);
        item.setItemprice(price);
        item.setItemimage(itemImage);
        item.setItemtype(2);
        return itemMapper.insertSelective(item);
    }

    @Override
    public Integer insertUserItem(Integer userID, Integer itemID) {
        UserItem userItem=new UserItem();
        userItem.setUserId(userID);
        userItem.setItemId(itemID);
        return userItemMapper.insert(userItem);
    }

    @Override
    public Integer deleteUserItemByID(Integer userID) {
        UserItemExample userItemExample=new UserItemExample();
        userItemExample.createCriteria().andUserIdEqualTo(userID);
        return userItemMapper.deleteByExample(userItemExample);
    }
}
