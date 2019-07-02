package co.topc.web.taobao.items.service;

import co.topc.web.taobao.items.entity.Items;
import co.topc.web.taobao.items.entity.ItemsQueryParam;

import java.util.List;

/**
 * @author zaqweb
 * @date 2019-07-01 12:56
 */
public interface ItemsService {

    List<Items> findItemsByExample(ItemsQueryParam param, int pageNum, int pageSize, String sortBy);

    Items findItemByKeyId(String keyId);


}
