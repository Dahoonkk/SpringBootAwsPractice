package com.dahoon.springboot.service.posts;

import com.dahoon.springboot.domain.posts.PostsRepository;
import com.dahoon.springboot.web.dto.PostsSaveRequestDto;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transaction;
import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
