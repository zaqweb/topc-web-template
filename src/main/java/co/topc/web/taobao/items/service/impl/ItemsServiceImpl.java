package co.topc.web.taobao.items.service.impl;

import co.topc.web.commons.utils.TopcStringUtils;
import co.topc.web.taobao.items.entity.Items;
import co.topc.web.taobao.items.entity.ItemsExample;
import co.topc.web.taobao.items.entity.ItemsQueryParam;
import co.topc.web.taobao.items.mapper.ItemsMapper;
import co.topc.web.taobao.items.service.ItemsService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zaqweb
 * @date 2019-07-01 12:57
 */
@Service
public class ItemsServiceImpl implements ItemsService {

  @Autowired
  ItemsMapper itemsMapper;

  @Override
  public List<Items> findItemsByExample(
      ItemsQueryParam param, int pageNum, int pageSize, String sortBy) {
    ItemsExample example = new ItemsExample();
    ItemsExample.Criteria c = example.createCriteria();
    if (TopcStringUtils.isNotEmpty(param.getCreateBy())) {
      c.andCreateByEqualTo(param.getCreateBy());
    }

    if (TopcStringUtils.isNotEmpty(param.getItemName())) {
      c.andItemNameEqualTo(param.getItemName());
    }
    PageHelper.startPage(pageNum, pageSize);
    List<Items> items = itemsMapper.selectByExample(example);
    return items;
  }

  @Override
  public Items findItemByKeyId(String keyId) {
    return itemsMapper.selectByPrimaryKey(keyId);
  }
}
