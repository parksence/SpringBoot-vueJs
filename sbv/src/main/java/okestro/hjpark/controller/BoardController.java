package okestro.hjpark.controller;

import okestro.hjpark.base.BaseResponse;
import okestro.hjpark.commons.Utils;
import okestro.hjpark.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/list")
    public ResponseEntity<BaseResponse> boardList() {
        Map<String, Object> boardList = boardService.boardList();

        BaseResponse response = BaseResponse.builder()
                .code("OK")
                .data(Utils.asMap(boardList))
                .build();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/list/{no}")
    public ResponseEntity<BaseResponse> boardDetail(@PathVariable("no") String no) {
        Map<String, Object> boardDetail = boardService.boardList();

    }

}
