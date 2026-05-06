package com.example.week6;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class CheerMessageService {

    private final CheerMessageRepository cheerMessageRepository;

    //컨트롤러에서 받은 새 응원 메시지(dto 형태)의 작성자 이름,내용을 저장
    @Transactional
    public void create(CheerMessageDTO cheerMessageDTO) {
        //받은 dto를 entity로 변환해 저장
        CheerMessage entity = new CheerMessage(cheerMessageDTO.writer(),cheerMessageDTO.content());
        cheerMessageRepository.save(entity);
    }




}
