package com.epam.bookstoreservice.hateoas.assembler;

import com.epam.bookstoreservice.dto.response.TokenResponseDTO;
import com.epam.bookstoreservice.hateoas.model.TokenModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

/**
 * model assembler for tokenResponseDTO
 */
@Component
public class TokenResponseDTOAssembler implements RepresentationModelAssembler<TokenResponseDTO, TokenModel> {
    @Override
    public TokenModel toModel(TokenResponseDTO tokenResponseDTO) {
        return new TokenModel(tokenResponseDTO);
    }
}