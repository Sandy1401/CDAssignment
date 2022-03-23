package com.example.demo.mapper;

import com.example.demo.dto.UserDetailsDto;
import com.example.demo.model.UserDetails;
import com.example.demo.model.UserDetails.UserDetailsBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-23T12:01:16+0530",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 17.0.2 (Eclipse Adoptium)"
)
@Component
public class UserDetailsMapperImpl implements UserDetailsMapper {

    @Override
    public UserDetailsDto toUserDetailsDto(UserDetails userDetails) {
        if ( userDetails == null ) {
            return null;
        }

        UserDetailsDto userDetailsDto = new UserDetailsDto();

        userDetailsDto.setId( userDetails.getId() );
        userDetailsDto.setUserName( userDetails.getUserName() );
        userDetailsDto.setSkillSet( userDetails.getSkillSet() );
        userDetailsDto.setLocation( userDetails.getLocation() );

        return userDetailsDto;
    }

    @Override
    public UserDetails toUserDetails(UserDetailsDto userDetailsDto) {
        if ( userDetailsDto == null ) {
            return null;
        }

        UserDetailsBuilder userDetails = UserDetails.builder();

        userDetails.userName( userDetailsDto.getUserName() );
        userDetails.skillSet( userDetailsDto.getSkillSet() );
        userDetails.location( userDetailsDto.getLocation() );

        return userDetails.build();
    }

    @Override
    public List<UserDetailsDto> entityListToDtoList(Iterable<UserDetails> iterable) {
        if ( iterable == null ) {
            return null;
        }

        List<UserDetailsDto> list = new ArrayList<UserDetailsDto>();
        for ( UserDetails userDetails : iterable ) {
            list.add( toUserDetailsDto( userDetails ) );
        }

        return list;
    }

    @Override
    public List<UserDetails> DtoListToEntityList(Iterable<UserDetailsDto> userDetailsDto) {
        if ( userDetailsDto == null ) {
            return null;
        }

        List<UserDetails> list = new ArrayList<UserDetails>();
        for ( UserDetailsDto userDetailsDto1 : userDetailsDto ) {
            list.add( toUserDetails( userDetailsDto1 ) );
        }

        return list;
    }
}
