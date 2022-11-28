package com.sdv.kit.server.dto.mapper;

import com.sdv.kit.server.dto.read.BoardReadDto;
import com.sdv.kit.server.dto.read.JobRoleReadDto;
import com.sdv.kit.server.dto.read.PersonReadDto;
import com.sdv.kit.server.model.Board;
import com.sdv.kit.server.model.JobRole;
import com.sdv.kit.server.model.Person;
import com.sdv.kit.server.model.PersonCredentials;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-28T15:21:26+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.1.jar, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class BoardMapperImpl implements BoardMapper {

    @Override
    public BoardReadDto toReadDto(Board board) {
        if ( board == null ) {
            return null;
        }

        String name = null;
        List<PersonReadDto> people = null;
        PersonReadDto creator = null;

        name = board.getName();
        people = personListToPersonReadDtoList( board.getPeople() );
        creator = personToPersonReadDto( board.getCreator() );

        BoardReadDto boardReadDto = new BoardReadDto( name, people, creator );

        return boardReadDto;
    }

    @Override
    public List<BoardReadDto> toReadDto(Iterable<Board> boards) {
        if ( boards == null ) {
            return null;
        }

        List<BoardReadDto> list = new ArrayList<BoardReadDto>();
        for ( Board board : boards ) {
            list.add( toReadDto( board ) );
        }

        return list;
    }

    @Override
    public Board fromReadDto(BoardReadDto boardReadDto) {
        if ( boardReadDto == null ) {
            return null;
        }

        Board.BoardBuilder board = Board.builder();

        board.name( boardReadDto.name() );
        board.people( personReadDtoListToPersonList( boardReadDto.people() ) );
        board.creator( personReadDtoToPerson( boardReadDto.creator() ) );

        return board.build();
    }

    @Override
    public List<Board> fromReadDto(Iterable<BoardReadDto> boardReadDtos) {
        if ( boardReadDtos == null ) {
            return null;
        }

        List<Board> list = new ArrayList<Board>();
        for ( BoardReadDto boardReadDto : boardReadDtos ) {
            list.add( fromReadDto( boardReadDto ) );
        }

        return list;
    }

    protected JobRoleReadDto jobRoleToJobRoleReadDto(JobRole jobRole) {
        if ( jobRole == null ) {
            return null;
        }

        String title = null;

        title = jobRole.getTitle();

        JobRoleReadDto jobRoleReadDto = new JobRoleReadDto( title );

        return jobRoleReadDto;
    }

    protected PersonReadDto personToPersonReadDto(Person person) {
        if ( person == null ) {
            return null;
        }

        String name = null;
        String phone = null;
        Integer workExperience = null;
        LocalDate dateOfBirthday = null;
        JobRoleReadDto jobRole = null;
        PersonCredentials personCredentials = null;

        name = person.getName();
        phone = person.getPhone();
        workExperience = person.getWorkExperience();
        dateOfBirthday = person.getDateOfBirthday();
        jobRole = jobRoleToJobRoleReadDto( person.getJobRole() );
        personCredentials = person.getPersonCredentials();

        PersonReadDto personReadDto = new PersonReadDto( name, phone, workExperience, dateOfBirthday, jobRole, personCredentials );

        return personReadDto;
    }

    protected List<PersonReadDto> personListToPersonReadDtoList(List<Person> list) {
        if ( list == null ) {
            return null;
        }

        List<PersonReadDto> list1 = new ArrayList<PersonReadDto>( list.size() );
        for ( Person person : list ) {
            list1.add( personToPersonReadDto( person ) );
        }

        return list1;
    }

    protected JobRole jobRoleReadDtoToJobRole(JobRoleReadDto jobRoleReadDto) {
        if ( jobRoleReadDto == null ) {
            return null;
        }

        JobRole.JobRoleBuilder jobRole = JobRole.builder();

        jobRole.title( jobRoleReadDto.title() );

        return jobRole.build();
    }

    protected Person personReadDtoToPerson(PersonReadDto personReadDto) {
        if ( personReadDto == null ) {
            return null;
        }

        Person.PersonBuilder person = Person.builder();

        person.name( personReadDto.name() );
        person.phone( personReadDto.phone() );
        person.workExperience( personReadDto.workExperience() );
        person.dateOfBirthday( personReadDto.dateOfBirthday() );
        person.jobRole( jobRoleReadDtoToJobRole( personReadDto.jobRole() ) );
        person.personCredentials( personReadDto.personCredentials() );

        return person.build();
    }

    protected List<Person> personReadDtoListToPersonList(List<PersonReadDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Person> list1 = new ArrayList<Person>( list.size() );
        for ( PersonReadDto personReadDto : list ) {
            list1.add( personReadDtoToPerson( personReadDto ) );
        }

        return list1;
    }
}
