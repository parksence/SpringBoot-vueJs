package okestro.hjpark.service;

import okestro.hjpark.dto.BoardDTO;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BoardService {

    public Map<String, Object> boardList() {
        Map<String, Object> map = new HashMap();

        for (int i = 1; i <= 100; i++) {
            BoardDTO response = BoardDTO.builder()
                    .id(i)
                    .title("test" + i)
                    .author("박희준" + i)
                    .comment_cnt(i % 5)  // 예시로 0~4개의 댓글 수를 만듦
                    .build();

            map.put(String.valueOf(i), response);
        }
        return map;
    }

    public Map<String, Object> boardDetails(int id) {

    }
}
