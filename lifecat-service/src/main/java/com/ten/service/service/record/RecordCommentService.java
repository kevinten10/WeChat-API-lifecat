package com.ten.service.service.record;

import com.ten.entity.RecordCommentDO;
import com.ten.service.service.BaseService;
import com.ten.vo.CommentVO;
import com.ten.vo.RecordVO;

/**
 * list   :获取用户某条record信息的c_record_comment集合
 * get    :获取用户某条record信息的c_record_comment
 * post   :添加新的c_record_comment记录到某条record下
 * put    :更新c_record_comment
 * delete :删除c_record_comment
 *
 * @author Administrator
 */
public interface RecordCommentService extends BaseService<CommentVO, RecordCommentDO> {
}
