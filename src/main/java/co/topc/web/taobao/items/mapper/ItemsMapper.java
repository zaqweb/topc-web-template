package co.topc.web.taobao.items.mapper;

import co.topc.web.taobao.items.entity.Items;
import co.topc.web.taobao.items.entity.ItemsExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ItemsDAO继承基类
 */
@Repository
@Mapper
public interface ItemsMapper extends MyBatisBaseMapper<Items, String, ItemsExample> {
}