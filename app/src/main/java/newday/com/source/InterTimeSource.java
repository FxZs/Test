package newday.com.source;

import java.util.List;

import io.reactivex.Flowable;
import newday.com.moudle.InterTimeEntity;

/**
 * Created by Administrator on 2018/9/10.
 */

public interface InterTimeSource {
    void insertInterTimeSource(InterTimeEntity interTimeEntity);
    Flowable< List<InterTimeEntity>> queryInterSource();
}
