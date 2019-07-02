package co.topc.web.taobao.items.controller;

import co.topc.web.commons.TopcWebResponse;
import co.topc.web.commons.utils.TopcWebResponseUtil;
import co.topc.web.taobao.items.entity.Items;
import co.topc.web.taobao.items.entity.ItemsQueryParam;
import co.topc.web.taobao.items.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zaqweb
 * @date 2019-06-30 21:26
 */
@RestController
@RequestMapping("/items")
public class ItemsController {

  @Autowired ItemsService itemsService;

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public TopcWebResponse listItems(
      ItemsQueryParam param,
      @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
      @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
      String sortBy) {
    return TopcWebResponseUtil.getSuccess(
        itemsService.findItemsByExample(param, pageNum, pageSize, sortBy));
  }

  @RequestMapping(value = "/", method = RequestMethod.POST)
  public Object saveItem(Items items) {
    // TopcWebResponse res = new TopcWebResponse();
    return null;
  }

  @RequestMapping(value = "/{itemKey}", method = RequestMethod.GET)
  public TopcWebResponse getItemDetail(@PathVariable String itemKey) {
    Items item = itemsService.findItemByKeyId(itemKey);
    if (null != item) {
      return TopcWebResponseUtil.getSuccess(item);
    } else {
      return TopcWebResponseUtil.getFaileNotFound();
    }
  }
}
