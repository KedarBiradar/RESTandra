// $ANTLR 3.2 Sep 23, 2009 12:02:23 /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g 2011-03-10 01:53:35

    package org.apache.cassandra.cql;
    import java.util.Map;
    import java.util.HashMap;
    import java.util.Collections;
    import org.apache.cassandra.thrift.ConsistencyLevel;
    import org.apache.cassandra.thrift.InvalidRequestException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "K_USE", "IDENT", "K_SELECT", "K_COUNT", "K_FROM", "K_USING", "K_CONSISTENCY", "K_LEVEL", "K_WHERE", "K_LIMIT", "INTEGER", "K_FIRST", "K_REVERSED", "RANGEOP", "K_AND", "K_BEGIN", "K_BATCH", "K_APPLY", "K_UPDATE", "K_SET", "K_KEY", "K_DELETE", "K_IN", "K_CREATE", "K_KEYSPACE", "K_WITH", "COMPIDENT", "STRING_LITERAL", "K_COLUMNFAMILY", "FLOAT", "K_INDEX", "K_ON", "K_DROP", "UNICODE", "UUID", "K_TRUNCATE", "S", "E", "L", "C", "T", "F", "R", "O", "M", "W", "H", "A", "N", "D", "K", "Y", "U", "K_COLUMN", "P", "I", "K_ROW", "G", "Q", "V", "B", "X", "J", "Z", "DIGIT", "LETTER", "HEX", "WS", "COMMENT", "MULTILINE_COMMENT", "'('", "')'", "','", "'='", "'bytes'", "'ascii'", "'utf8'", "'int'", "'long'", "'uuid'", "'timeuuid'", "'<'", "'<='", "'>='", "'>'", "';'", "'timeuuid('"
    };
    public static final int UUID=38;
    public static final int LETTER=69;
    public static final int K_DELETE=25;
    public static final int K_CREATE=27;
    public static final int FLOAT=33;
    public static final int EOF=-1;
    public static final int K_SELECT=6;
    public static final int K_LIMIT=13;
    public static final int K_SET=23;
    public static final int K_WHERE=12;
    public static final int K_COLUMN=57;
    public static final int MULTILINE_COMMENT=73;
    public static final int K_USE=4;
    public static final int STRING_LITERAL=31;
    public static final int T__90=90;
    public static final int K_ON=35;
    public static final int HEX=70;
    public static final int K_USING=9;
    public static final int K_KEY=24;
    public static final int IDENT=5;
    public static final int DIGIT=68;
    public static final int COMMENT=72;
    public static final int K_TRUNCATE=39;
    public static final int K_FIRST=15;
    public static final int K_BEGIN=19;
    public static final int D=53;
    public static final int INTEGER=14;
    public static final int E=41;
    public static final int RANGEOP=17;
    public static final int F=45;
    public static final int G=61;
    public static final int K_KEYSPACE=28;
    public static final int T__80=80;
    public static final int K_COUNT=7;
    public static final int A=51;
    public static final int T__81=81;
    public static final int B=64;
    public static final int T__82=82;
    public static final int C=43;
    public static final int T__83=83;
    public static final int L=42;
    public static final int M=48;
    public static final int N=52;
    public static final int O=47;
    public static final int H=50;
    public static final int I=59;
    public static final int J=66;
    public static final int K_UPDATE=22;
    public static final int K=54;
    public static final int U=56;
    public static final int K_CONSISTENCY=10;
    public static final int T=44;
    public static final int COMPIDENT=30;
    public static final int K_WITH=29;
    public static final int W=49;
    public static final int V=63;
    public static final int Q=62;
    public static final int P=58;
    public static final int S=40;
    public static final int K_IN=26;
    public static final int R=46;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int Y=55;
    public static final int UNICODE=37;
    public static final int T__89=89;
    public static final int X=65;
    public static final int T__88=88;
    public static final int Z=67;
    public static final int K_FROM=8;
    public static final int K_INDEX=34;
    public static final int K_REVERSED=16;
    public static final int WS=71;
    public static final int K_COLUMNFAMILY=32;
    public static final int K_APPLY=21;
    public static final int K_DROP=36;
    public static final int K_AND=18;
    public static final int K_ROW=60;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__79=79;
    public static final int K_LEVEL=11;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int K_BATCH=20;

    // delegates
    // delegators


        public CqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CqlParser.tokenNames; }
    public String getGrammarFileName() { return "/media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g"; }


        private List<String> recognitionErrors = new ArrayList<String>();
        
        public void displayRecognitionError(String[] tokenNames, RecognitionException e)
        {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            recognitionErrors.add(hdr + " " + msg);
        }
        
        public List<String> getRecognitionErrors()
        {
            return recognitionErrors;
        }
        
        public void throwLastRecognitionError() throws InvalidRequestException
        {
            if (recognitionErrors.size() > 0)
                throw new InvalidRequestException(recognitionErrors.get((recognitionErrors.size()-1)));
        }



    // $ANTLR start "query"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:58:1: query returns [CQLStatement stmnt] : ( selectStatement | updateStatement | batchUpdateStatement | useStatement | truncateStatement | deleteStatement | createKeyspaceStatement | createColumnFamilyStatement | createIndexStatement | dropKeyspaceStatement | dropColumnFamilyStatement );
    public final CQLStatement query() throws RecognitionException {
        CQLStatement stmnt = null;

        SelectStatement selectStatement1 = null;

        UpdateStatement updateStatement2 = null;

        BatchUpdateStatement batchUpdateStatement3 = null;

        String useStatement4 = null;

        String truncateStatement5 = null;

        DeleteStatement deleteStatement6 = null;

        CreateKeyspaceStatement createKeyspaceStatement7 = null;

        CreateColumnFamilyStatement createColumnFamilyStatement8 = null;

        CreateIndexStatement createIndexStatement9 = null;

        String dropKeyspaceStatement10 = null;

        String dropColumnFamilyStatement11 = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:59:5: ( selectStatement | updateStatement | batchUpdateStatement | useStatement | truncateStatement | deleteStatement | createKeyspaceStatement | createColumnFamilyStatement | createIndexStatement | dropKeyspaceStatement | dropColumnFamilyStatement )
            int alt1=11;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:59:7: selectStatement
                    {
                    pushFollow(FOLLOW_selectStatement_in_query64);
                    selectStatement1=selectStatement();

                    state._fsp--;

                     stmnt = new CQLStatement(StatementType.SELECT, selectStatement1); 

                    }
                    break;
                case 2 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:60:7: updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_query76);
                    updateStatement2=updateStatement();

                    state._fsp--;

                     stmnt = new CQLStatement(StatementType.UPDATE, updateStatement2); 

                    }
                    break;
                case 3 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:61:7: batchUpdateStatement
                    {
                    pushFollow(FOLLOW_batchUpdateStatement_in_query88);
                    batchUpdateStatement3=batchUpdateStatement();

                    state._fsp--;

                     stmnt = new CQLStatement(StatementType.BATCH_UPDATE, batchUpdateStatement3); 

                    }
                    break;
                case 4 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:62:7: useStatement
                    {
                    pushFollow(FOLLOW_useStatement_in_query98);
                    useStatement4=useStatement();

                    state._fsp--;

                     stmnt = new CQLStatement(StatementType.USE, useStatement4); 

                    }
                    break;
                case 5 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:63:7: truncateStatement
                    {
                    pushFollow(FOLLOW_truncateStatement_in_query113);
                    truncateStatement5=truncateStatement();

                    state._fsp--;

                     stmnt = new CQLStatement(StatementType.TRUNCATE, truncateStatement5); 

                    }
                    break;
                case 6 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:64:7: deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_query123);
                    deleteStatement6=deleteStatement();

                    state._fsp--;

                     stmnt = new CQLStatement(StatementType.DELETE, deleteStatement6); 

                    }
                    break;
                case 7 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:65:7: createKeyspaceStatement
                    {
                    pushFollow(FOLLOW_createKeyspaceStatement_in_query135);
                    createKeyspaceStatement7=createKeyspaceStatement();

                    state._fsp--;

                     stmnt = new CQLStatement(StatementType.CREATE_KEYSPACE, createKeyspaceStatement7); 

                    }
                    break;
                case 8 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:66:7: createColumnFamilyStatement
                    {
                    pushFollow(FOLLOW_createColumnFamilyStatement_in_query145);
                    createColumnFamilyStatement8=createColumnFamilyStatement();

                    state._fsp--;

                     stmnt = new CQLStatement(StatementType.CREATE_COLUMNFAMILY, createColumnFamilyStatement8); 

                    }
                    break;
                case 9 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:67:7: createIndexStatement
                    {
                    pushFollow(FOLLOW_createIndexStatement_in_query155);
                    createIndexStatement9=createIndexStatement();

                    state._fsp--;

                     stmnt = new CQLStatement(StatementType.CREATE_INDEX, createIndexStatement9); 

                    }
                    break;
                case 10 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:68:7: dropKeyspaceStatement
                    {
                    pushFollow(FOLLOW_dropKeyspaceStatement_in_query165);
                    dropKeyspaceStatement10=dropKeyspaceStatement();

                    state._fsp--;

                     stmnt = new CQLStatement(StatementType.DROP_KEYSPACE, dropKeyspaceStatement10); 

                    }
                    break;
                case 11 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:69:7: dropColumnFamilyStatement
                    {
                    pushFollow(FOLLOW_dropColumnFamilyStatement_in_query175);
                    dropColumnFamilyStatement11=dropColumnFamilyStatement();

                    state._fsp--;

                     stmnt = new CQLStatement(StatementType.DROP_COLUMNFAMILY, dropColumnFamilyStatement11); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmnt;
    }
    // $ANTLR end "query"


    // $ANTLR start "useStatement"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:73:1: useStatement returns [String keyspace] : K_USE IDENT endStmnt ;
    public final String useStatement() throws RecognitionException {
        String keyspace = null;

        Token IDENT12=null;

        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:74:5: ( K_USE IDENT endStmnt )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:74:7: K_USE IDENT endStmnt
            {
            match(input,K_USE,FOLLOW_K_USE_in_useStatement199); 
            IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_useStatement201); 
             keyspace = (IDENT12!=null?IDENT12.getText():null); 
            pushFollow(FOLLOW_endStmnt_in_useStatement205);
            endStmnt();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return keyspace;
    }
    // $ANTLR end "useStatement"


    // $ANTLR start "selectStatement"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:77:1: selectStatement returns [SelectStatement expr] : K_SELECT (s1= selectExpression | K_COUNT '(' s2= selectExpression ')' ) K_FROM columnFamily= IDENT ( K_USING K_CONSISTENCY K_LEVEL )? ( K_WHERE whereClause )? ( K_LIMIT rows= INTEGER )? endStmnt ;
    public final SelectStatement selectStatement() throws RecognitionException {
        SelectStatement expr = null;

        Token columnFamily=null;
        Token rows=null;
        Token K_LEVEL13=null;
        SelectExpression s1 = null;

        SelectExpression s2 = null;

        WhereClause whereClause14 = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:88:5: ( K_SELECT (s1= selectExpression | K_COUNT '(' s2= selectExpression ')' ) K_FROM columnFamily= IDENT ( K_USING K_CONSISTENCY K_LEVEL )? ( K_WHERE whereClause )? ( K_LIMIT rows= INTEGER )? endStmnt )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:88:7: K_SELECT (s1= selectExpression | K_COUNT '(' s2= selectExpression ')' ) K_FROM columnFamily= IDENT ( K_USING K_CONSISTENCY K_LEVEL )? ( K_WHERE whereClause )? ( K_LIMIT rows= INTEGER )? endStmnt
            {
             
                      int numRecords = 10000;
                      SelectExpression expression = null;
                      boolean isCountOp = false;
                      ConsistencyLevel cLevel = ConsistencyLevel.ONE;
                  
            match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement236); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:95:11: (s1= selectExpression | K_COUNT '(' s2= selectExpression ')' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=INTEGER && LA2_0<=K_REVERSED)||LA2_0==STRING_LITERAL||(LA2_0>=UNICODE && LA2_0<=UUID)||LA2_0==90) ) {
                alt2=1;
            }
            else if ( (LA2_0==K_COUNT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:95:13: s1= selectExpression
                    {
                    pushFollow(FOLLOW_selectExpression_in_selectStatement252);
                    s1=selectExpression();

                    state._fsp--;

                     expression = s1; 

                    }
                    break;
                case 2 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:96:13: K_COUNT '(' s2= selectExpression ')'
                    {
                    match(input,K_COUNT,FOLLOW_K_COUNT_in_selectStatement284); 
                    match(input,74,FOLLOW_74_in_selectStatement286); 
                    pushFollow(FOLLOW_selectExpression_in_selectStatement290);
                    s2=selectExpression();

                    state._fsp--;

                    match(input,75,FOLLOW_75_in_selectStatement292); 
                     expression = s2; isCountOp = true; 

                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement318); 
            columnFamily=(Token)match(input,IDENT,FOLLOW_IDENT_in_selectStatement322); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:99:11: ( K_USING K_CONSISTENCY K_LEVEL )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==K_USING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:99:13: K_USING K_CONSISTENCY K_LEVEL
                    {
                    match(input,K_USING,FOLLOW_K_USING_in_selectStatement336); 
                    match(input,K_CONSISTENCY,FOLLOW_K_CONSISTENCY_in_selectStatement338); 
                    K_LEVEL13=(Token)match(input,K_LEVEL,FOLLOW_K_LEVEL_in_selectStatement340); 
                     cLevel = ConsistencyLevel.valueOf((K_LEVEL13!=null?K_LEVEL13.getText():null)); 

                    }
                    break;

            }

            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:100:11: ( K_WHERE whereClause )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==K_WHERE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:100:13: K_WHERE whereClause
                    {
                    match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement359); 
                    pushFollow(FOLLOW_whereClause_in_selectStatement361);
                    whereClause14=whereClause();

                    state._fsp--;


                    }
                    break;

            }

            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:101:11: ( K_LIMIT rows= INTEGER )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==K_LIMIT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:101:13: K_LIMIT rows= INTEGER
                    {
                    match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement378); 
                    rows=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectStatement382); 
                     numRecords = Integer.parseInt((rows!=null?rows.getText():null)); 

                    }
                    break;

            }

            pushFollow(FOLLOW_endStmnt_in_selectStatement399);
            endStmnt();

            state._fsp--;


                      return new SelectStatement(expression,
                                                 isCountOp,
                                                 (columnFamily!=null?columnFamily.getText():null),
                                                 cLevel,
                                                 whereClause14,
                                                 numRecords);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectStatement"


    // $ANTLR start "selectExpression"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:115:1: selectExpression returns [SelectExpression expr] : ( K_FIRST cols= INTEGER )? ( K_REVERSED )? (first= term ( ',' next= term )* | start= term RANGEOP finish= term ) ;
    public final SelectExpression selectExpression() throws RecognitionException {
        SelectExpression expr = null;

        Token cols=null;
        Term first = null;

        Term next = null;

        Term start = null;

        Term finish = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:116:5: ( ( K_FIRST cols= INTEGER )? ( K_REVERSED )? (first= term ( ',' next= term )* | start= term RANGEOP finish= term ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:116:7: ( K_FIRST cols= INTEGER )? ( K_REVERSED )? (first= term ( ',' next= term )* | start= term RANGEOP finish= term )
            {

                      int count = 10000;
                      boolean reversed = false;
                  
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:120:7: ( K_FIRST cols= INTEGER )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==K_FIRST) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:120:9: K_FIRST cols= INTEGER
                    {
                    match(input,K_FIRST,FOLLOW_K_FIRST_in_selectExpression440); 
                    cols=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectExpression444); 
                     count = Integer.parseInt((cols!=null?cols.getText():null)); 

                    }
                    break;

            }

            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:121:7: ( K_REVERSED )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==K_REVERSED) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:121:9: K_REVERSED
                    {
                    match(input,K_REVERSED,FOLLOW_K_REVERSED_in_selectExpression459); 
                     reversed = true; 

                    }
                    break;

            }

            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:122:7: (first= term ( ',' next= term )* | start= term RANGEOP finish= term )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:122:9: first= term ( ',' next= term )*
                    {
                    pushFollow(FOLLOW_term_in_selectExpression476);
                    first=term();

                    state._fsp--;

                     expr = new SelectExpression(first, count, reversed); 
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:123:13: ( ',' next= term )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==76) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:123:14: ',' next= term
                    	    {
                    	    match(input,76,FOLLOW_76_in_selectExpression493); 
                    	    pushFollow(FOLLOW_term_in_selectExpression497);
                    	    next=term();

                    	    state._fsp--;

                    	     expr.and(next); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:124:9: start= term RANGEOP finish= term
                    {
                    pushFollow(FOLLOW_term_in_selectExpression513);
                    start=term();

                    state._fsp--;

                    match(input,RANGEOP,FOLLOW_RANGEOP_in_selectExpression515); 
                    pushFollow(FOLLOW_term_in_selectExpression519);
                    finish=term();

                    state._fsp--;

                     expr = new SelectExpression(start, finish, count, reversed); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectExpression"


    // $ANTLR start "whereClause"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:129:1: whereClause returns [WhereClause clause] : first= relation ( K_AND next= relation )* ;
    public final WhereClause whereClause() throws RecognitionException {
        WhereClause clause = null;

        Relation first = null;

        Relation next = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:130:5: (first= relation ( K_AND next= relation )* )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:130:7: first= relation ( K_AND next= relation )*
            {
            pushFollow(FOLLOW_relation_in_whereClause553);
            first=relation();

            state._fsp--;

             clause = new WhereClause(first); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:131:11: ( K_AND next= relation )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==K_AND) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:131:12: K_AND next= relation
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_whereClause569); 
            	    pushFollow(FOLLOW_relation_in_whereClause573);
            	    next=relation();

            	    state._fsp--;

            	     clause.and(next); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return clause;
    }
    // $ANTLR end "whereClause"


    // $ANTLR start "batchUpdateStatement"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:134:1: batchUpdateStatement returns [BatchUpdateStatement expr] : K_BEGIN K_BATCH ( K_USING K_CONSISTENCY K_LEVEL )? u1= updateStatement (uN= updateStatement )* K_APPLY K_BATCH EOF ;
    public final BatchUpdateStatement batchUpdateStatement() throws RecognitionException {
        BatchUpdateStatement expr = null;

        Token K_LEVEL15=null;
        UpdateStatement u1 = null;

        UpdateStatement uN = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:142:5: ( K_BEGIN K_BATCH ( K_USING K_CONSISTENCY K_LEVEL )? u1= updateStatement (uN= updateStatement )* K_APPLY K_BATCH EOF )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:142:7: K_BEGIN K_BATCH ( K_USING K_CONSISTENCY K_LEVEL )? u1= updateStatement (uN= updateStatement )* K_APPLY K_BATCH EOF
            {

                      ConsistencyLevel cLevel = ConsistencyLevel.ONE;
                      List<UpdateStatement> updates = new ArrayList<UpdateStatement>();
                  
            match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchUpdateStatement608); 
            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchUpdateStatement610); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:146:23: ( K_USING K_CONSISTENCY K_LEVEL )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==K_USING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:146:25: K_USING K_CONSISTENCY K_LEVEL
                    {
                    match(input,K_USING,FOLLOW_K_USING_in_batchUpdateStatement614); 
                    match(input,K_CONSISTENCY,FOLLOW_K_CONSISTENCY_in_batchUpdateStatement616); 
                    K_LEVEL15=(Token)match(input,K_LEVEL,FOLLOW_K_LEVEL_in_batchUpdateStatement618); 
                     cLevel = ConsistencyLevel.valueOf((K_LEVEL15!=null?K_LEVEL15.getText():null)); 

                    }
                    break;

            }

            pushFollow(FOLLOW_updateStatement_in_batchUpdateStatement637);
            u1=updateStatement();

            state._fsp--;

             updates.add(u1); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:147:51: (uN= updateStatement )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==K_UPDATE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:147:53: uN= updateStatement
            	    {
            	    pushFollow(FOLLOW_updateStatement_in_batchUpdateStatement645);
            	    uN=updateStatement();

            	    state._fsp--;

            	     updates.add(uN); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,K_APPLY,FOLLOW_K_APPLY_in_batchUpdateStatement658); 
            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchUpdateStatement660); 
            match(input,EOF,FOLLOW_EOF_in_batchUpdateStatement662); 

                      return new BatchUpdateStatement(updates, cLevel);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "batchUpdateStatement"


    // $ANTLR start "updateStatement"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:154:1: updateStatement returns [UpdateStatement expr] : K_UPDATE columnFamily= IDENT ( K_USING K_CONSISTENCY K_LEVEL )? K_SET termPair[columns] ( ',' termPair[columns] )* K_WHERE K_KEY '=' key= term endStmnt ;
    public final UpdateStatement updateStatement() throws RecognitionException {
        UpdateStatement expr = null;

        Token columnFamily=null;
        Token K_LEVEL16=null;
        Term key = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:166:5: ( K_UPDATE columnFamily= IDENT ( K_USING K_CONSISTENCY K_LEVEL )? K_SET termPair[columns] ( ',' termPair[columns] )* K_WHERE K_KEY '=' key= term endStmnt )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:166:7: K_UPDATE columnFamily= IDENT ( K_USING K_CONSISTENCY K_LEVEL )? K_SET termPair[columns] ( ',' termPair[columns] )* K_WHERE K_KEY '=' key= term endStmnt
            {

                      ConsistencyLevel cLevel = null;
                      Map<Term, Term> columns = new HashMap<Term, Term>();
                  
            match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement701); 
            columnFamily=(Token)match(input,IDENT,FOLLOW_IDENT_in_updateStatement705); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:171:11: ( K_USING K_CONSISTENCY K_LEVEL )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==K_USING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:171:12: K_USING K_CONSISTENCY K_LEVEL
                    {
                    match(input,K_USING,FOLLOW_K_USING_in_updateStatement718); 
                    match(input,K_CONSISTENCY,FOLLOW_K_CONSISTENCY_in_updateStatement720); 
                    K_LEVEL16=(Token)match(input,K_LEVEL,FOLLOW_K_LEVEL_in_updateStatement722); 
                     cLevel = ConsistencyLevel.valueOf((K_LEVEL16!=null?K_LEVEL16.getText():null)); 

                    }
                    break;

            }

            match(input,K_SET,FOLLOW_K_SET_in_updateStatement738); 
            pushFollow(FOLLOW_termPair_in_updateStatement740);
            termPair(columns);

            state._fsp--;

            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:172:35: ( ',' termPair[columns] )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==76) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:172:36: ',' termPair[columns]
            	    {
            	    match(input,76,FOLLOW_76_in_updateStatement744); 
            	    pushFollow(FOLLOW_termPair_in_updateStatement746);
            	    termPair(columns);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement761); 
            match(input,K_KEY,FOLLOW_K_KEY_in_updateStatement763); 
            match(input,77,FOLLOW_77_in_updateStatement765); 
            pushFollow(FOLLOW_term_in_updateStatement769);
            key=term();

            state._fsp--;

            pushFollow(FOLLOW_endStmnt_in_updateStatement771);
            endStmnt();

            state._fsp--;


                      return new UpdateStatement((columnFamily!=null?columnFamily.getText():null), cLevel, columns, key);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "updateStatement"


    // $ANTLR start "deleteStatement"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:179:1: deleteStatement returns [DeleteStatement expr] : K_DELETE (cols= termList )? K_FROM columnFamily= IDENT ( K_USING K_CONSISTENCY K_LEVEL )? K_WHERE ( K_KEY '=' key= term | K_KEY K_IN '(' keys= termList ')' )? ;
    public final DeleteStatement deleteStatement() throws RecognitionException {
        DeleteStatement expr = null;

        Token columnFamily=null;
        List<Term> cols = null;

        Term key = null;

        List<Term> keys = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:190:5: ( K_DELETE (cols= termList )? K_FROM columnFamily= IDENT ( K_USING K_CONSISTENCY K_LEVEL )? K_WHERE ( K_KEY '=' key= term | K_KEY K_IN '(' keys= termList ')' )? )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:190:7: K_DELETE (cols= termList )? K_FROM columnFamily= IDENT ( K_USING K_CONSISTENCY K_LEVEL )? K_WHERE ( K_KEY '=' key= term | K_KEY K_IN '(' keys= termList ')' )?
            {

                      ConsistencyLevel cLevel = ConsistencyLevel.ONE;
                      List<Term> keyList = null;
                      List<Term> columnsList = Collections.emptyList();
                  
            match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement810); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:196:11: (cols= termList )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==INTEGER||LA15_0==STRING_LITERAL||(LA15_0>=UNICODE && LA15_0<=UUID)||LA15_0==90) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:196:13: cols= termList
                    {
                    pushFollow(FOLLOW_termList_in_deleteStatement826);
                    cols=termList();

                    state._fsp--;

                     columnsList = cols; 

                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement842); 
            columnFamily=(Token)match(input,IDENT,FOLLOW_IDENT_in_deleteStatement846); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:197:37: ( K_USING K_CONSISTENCY K_LEVEL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==K_USING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:197:39: K_USING K_CONSISTENCY K_LEVEL
                    {
                    match(input,K_USING,FOLLOW_K_USING_in_deleteStatement850); 
                    match(input,K_CONSISTENCY,FOLLOW_K_CONSISTENCY_in_deleteStatement852); 
                    match(input,K_LEVEL,FOLLOW_K_LEVEL_in_deleteStatement854); 

                    }
                    break;

            }

            match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement869); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:198:19: ( K_KEY '=' key= term | K_KEY K_IN '(' keys= termList ')' )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==K_KEY) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==77) ) {
                    alt17=1;
                }
                else if ( (LA17_1==K_IN) ) {
                    alt17=2;
                }
            }
            switch (alt17) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:198:21: K_KEY '=' key= term
                    {
                    match(input,K_KEY,FOLLOW_K_KEY_in_deleteStatement873); 
                    match(input,77,FOLLOW_77_in_deleteStatement875); 
                    pushFollow(FOLLOW_term_in_deleteStatement879);
                    key=term();

                    state._fsp--;

                     keyList = Collections.singletonList(key); 

                    }
                    break;
                case 2 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:199:21: K_KEY K_IN '(' keys= termList ')'
                    {
                    match(input,K_KEY,FOLLOW_K_KEY_in_deleteStatement913); 
                    match(input,K_IN,FOLLOW_K_IN_in_deleteStatement915); 
                    match(input,74,FOLLOW_74_in_deleteStatement917); 
                    pushFollow(FOLLOW_termList_in_deleteStatement921);
                    keys=termList();

                    state._fsp--;

                     keyList = keys; 
                    match(input,75,FOLLOW_75_in_deleteStatement925); 

                    }
                    break;

            }


                      return new DeleteStatement(columnsList, (columnFamily!=null?columnFamily.getText():null), cLevel, keyList);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "deleteStatement"


    // $ANTLR start "createKeyspaceStatement"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:206:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE keyspace= IDENT K_WITH a1= ( COMPIDENT | IDENT ) '=' v1= ( STRING_LITERAL | INTEGER ) ( K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER ) )* endStmnt ;
    public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
        CreateKeyspaceStatement expr = null;

        Token keyspace=null;
        Token a1=null;
        Token v1=null;
        Token aN=null;
        Token vN=null;

        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:208:5: ( K_CREATE K_KEYSPACE keyspace= IDENT K_WITH a1= ( COMPIDENT | IDENT ) '=' v1= ( STRING_LITERAL | INTEGER ) ( K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER ) )* endStmnt )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:208:7: K_CREATE K_KEYSPACE keyspace= IDENT K_WITH a1= ( COMPIDENT | IDENT ) '=' v1= ( STRING_LITERAL | INTEGER ) ( K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER ) )* endStmnt
            {

                      Map<String, String> attrs = new HashMap<String, String>();
                  
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement985); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement987); 
            keyspace=(Token)match(input,IDENT,FOLLOW_IDENT_in_createKeyspaceStatement991); 
            match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement1003); 
            a1=(Token)input.LT(1);
            if ( input.LA(1)==IDENT||input.LA(1)==COMPIDENT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,77,FOLLOW_77_in_createKeyspaceStatement1018); 
            v1=(Token)input.LT(1);
            if ( input.LA(1)==INTEGER||input.LA(1)==STRING_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             attrs.put((a1!=null?a1.getText():null), (v1!=null?v1.getText():null)); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:213:11: ( K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==K_AND) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:213:13: K_AND aN= ( COMPIDENT | IDENT ) '=' vN= ( STRING_LITERAL | INTEGER )
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_createKeyspaceStatement1046); 
            	    aN=(Token)input.LT(1);
            	    if ( input.LA(1)==IDENT||input.LA(1)==COMPIDENT ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    match(input,77,FOLLOW_77_in_createKeyspaceStatement1060); 
            	    vN=(Token)input.LT(1);
            	    if ( input.LA(1)==INTEGER||input.LA(1)==STRING_LITERAL ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	     attrs.put((aN!=null?aN.getText():null), (vN!=null?vN.getText():null)); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            pushFollow(FOLLOW_endStmnt_in_createKeyspaceStatement1089);
            endStmnt();

            state._fsp--;


                      return new CreateKeyspaceStatement((keyspace!=null?keyspace.getText():null), attrs);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createKeyspaceStatement"


    // $ANTLR start "createColumnFamilyStatement"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:220:1: createColumnFamilyStatement returns [CreateColumnFamilyStatement expr] : K_CREATE K_COLUMNFAMILY name= IDENT ( '(' col1= term v1= createCfamColumnValidator ( ',' colN= term vN= createCfamColumnValidator )* ')' )? ( K_WITH prop1= IDENT '=' arg1= createCfamKeywordArgument ( K_AND propN= IDENT '=' argN= createCfamKeywordArgument )* )? endStmnt ;
    public final CreateColumnFamilyStatement createColumnFamilyStatement() throws RecognitionException {
        CreateColumnFamilyStatement expr = null;

        Token name=null;
        Token prop1=null;
        Token propN=null;
        Term col1 = null;

        String v1 = null;

        Term colN = null;

        String vN = null;

        String arg1 = null;

        String argN = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:228:5: ( K_CREATE K_COLUMNFAMILY name= IDENT ( '(' col1= term v1= createCfamColumnValidator ( ',' colN= term vN= createCfamColumnValidator )* ')' )? ( K_WITH prop1= IDENT '=' arg1= createCfamKeywordArgument ( K_AND propN= IDENT '=' argN= createCfamKeywordArgument )* )? endStmnt )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:228:7: K_CREATE K_COLUMNFAMILY name= IDENT ( '(' col1= term v1= createCfamColumnValidator ( ',' colN= term vN= createCfamColumnValidator )* ')' )? ( K_WITH prop1= IDENT '=' arg1= createCfamKeywordArgument ( K_AND propN= IDENT '=' argN= createCfamKeywordArgument )* )? endStmnt
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createColumnFamilyStatement1124); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createColumnFamilyStatement1126); 
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_createColumnFamilyStatement1130); 
             expr = new CreateColumnFamilyStatement((name!=null?name.getText():null)); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:228:99: ( '(' col1= term v1= createCfamColumnValidator ( ',' colN= term vN= createCfamColumnValidator )* ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==74) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:228:101: '(' col1= term v1= createCfamColumnValidator ( ',' colN= term vN= createCfamColumnValidator )* ')'
                    {
                    match(input,74,FOLLOW_74_in_createColumnFamilyStatement1136); 
                    pushFollow(FOLLOW_term_in_createColumnFamilyStatement1150);
                    col1=term();

                    state._fsp--;

                    pushFollow(FOLLOW_createCfamColumnValidator_in_createColumnFamilyStatement1154);
                    v1=createCfamColumnValidator();

                    state._fsp--;

                     expr.addColumn(col1, v1); 
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:229:92: ( ',' colN= term vN= createCfamColumnValidator )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==76) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:229:94: ',' colN= term vN= createCfamColumnValidator
                    	    {
                    	    match(input,76,FOLLOW_76_in_createColumnFamilyStatement1160); 
                    	    pushFollow(FOLLOW_term_in_createColumnFamilyStatement1174);
                    	    colN=term();

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_createCfamColumnValidator_in_createColumnFamilyStatement1178);
                    	    vN=createCfamColumnValidator();

                    	    state._fsp--;

                    	     expr.addColumn(colN, vN); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match(input,75,FOLLOW_75_in_createColumnFamilyStatement1191); 

                    }
                    break;

            }

            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:232:7: ( K_WITH prop1= IDENT '=' arg1= createCfamKeywordArgument ( K_AND propN= IDENT '=' argN= createCfamKeywordArgument )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==K_WITH) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:232:9: K_WITH prop1= IDENT '=' arg1= createCfamKeywordArgument ( K_AND propN= IDENT '=' argN= createCfamKeywordArgument )*
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_createColumnFamilyStatement1204); 
                    prop1=(Token)match(input,IDENT,FOLLOW_IDENT_in_createColumnFamilyStatement1208); 
                    match(input,77,FOLLOW_77_in_createColumnFamilyStatement1210); 
                    pushFollow(FOLLOW_createCfamKeywordArgument_in_createColumnFamilyStatement1214);
                    arg1=createCfamKeywordArgument();

                    state._fsp--;

                     expr.addProperty((prop1!=null?prop1.getText():null), arg1); 
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:233:11: ( K_AND propN= IDENT '=' argN= createCfamKeywordArgument )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==K_AND) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:233:13: K_AND propN= IDENT '=' argN= createCfamKeywordArgument
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_createColumnFamilyStatement1230); 
                    	    propN=(Token)match(input,IDENT,FOLLOW_IDENT_in_createColumnFamilyStatement1234); 
                    	    match(input,77,FOLLOW_77_in_createColumnFamilyStatement1236); 
                    	    pushFollow(FOLLOW_createCfamKeywordArgument_in_createColumnFamilyStatement1240);
                    	    argN=createCfamKeywordArgument();

                    	    state._fsp--;

                    	     expr.addProperty((propN!=null?propN.getText():null), argN); 

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            pushFollow(FOLLOW_endStmnt_in_createColumnFamilyStatement1262);
            endStmnt();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createColumnFamilyStatement"


    // $ANTLR start "createCfamColumnValidator"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:238:1: createCfamColumnValidator returns [String validator] : ( comparatorType | STRING_LITERAL );
    public final String createCfamColumnValidator() throws RecognitionException {
        String validator = null;

        Token STRING_LITERAL18=null;
        CqlParser.comparatorType_return comparatorType17 = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:239:5: ( comparatorType | STRING_LITERAL )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=78 && LA23_0<=84)) ) {
                alt23=1;
            }
            else if ( (LA23_0==STRING_LITERAL) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:239:7: comparatorType
                    {
                    pushFollow(FOLLOW_comparatorType_in_createCfamColumnValidator1283);
                    comparatorType17=comparatorType();

                    state._fsp--;

                     validator = (comparatorType17!=null?input.toString(comparatorType17.start,comparatorType17.stop):null); 

                    }
                    break;
                case 2 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:240:7: STRING_LITERAL
                    {
                    STRING_LITERAL18=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createCfamColumnValidator1293); 
                     validator = (STRING_LITERAL18!=null?STRING_LITERAL18.getText():null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return validator;
    }
    // $ANTLR end "createCfamColumnValidator"


    // $ANTLR start "createCfamKeywordArgument"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:243:1: createCfamKeywordArgument returns [String arg] : ( comparatorType | value= ( STRING_LITERAL | INTEGER | FLOAT ) );
    public final String createCfamKeywordArgument() throws RecognitionException {
        String arg = null;

        Token value=null;
        CqlParser.comparatorType_return comparatorType19 = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:244:5: ( comparatorType | value= ( STRING_LITERAL | INTEGER | FLOAT ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=78 && LA24_0<=84)) ) {
                alt24=1;
            }
            else if ( (LA24_0==INTEGER||LA24_0==STRING_LITERAL||LA24_0==FLOAT) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:244:7: comparatorType
                    {
                    pushFollow(FOLLOW_comparatorType_in_createCfamKeywordArgument1316);
                    comparatorType19=comparatorType();

                    state._fsp--;

                     arg = (comparatorType19!=null?input.toString(comparatorType19.start,comparatorType19.stop):null); 

                    }
                    break;
                case 2 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:245:7: value= ( STRING_LITERAL | INTEGER | FLOAT )
                    {
                    value=(Token)input.LT(1);
                    if ( input.LA(1)==INTEGER||input.LA(1)==STRING_LITERAL||input.LA(1)==FLOAT ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     arg = (value!=null?value.getText():null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return arg;
    }
    // $ANTLR end "createCfamKeywordArgument"


    // $ANTLR start "createIndexStatement"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:248:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= IDENT '(' columnName= term ')' endStmnt ;
    public final CreateIndexStatement createIndexStatement() throws RecognitionException {
        CreateIndexStatement expr = null;

        Token idxName=null;
        Token cf=null;
        Term columnName = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:250:5: ( K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= IDENT '(' columnName= term ')' endStmnt )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:250:7: K_CREATE K_INDEX (idxName= IDENT )? K_ON cf= IDENT '(' columnName= term ')' endStmnt
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement1365); 
            match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement1367); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:250:24: (idxName= IDENT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IDENT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:250:25: idxName= IDENT
                    {
                    idxName=(Token)match(input,IDENT,FOLLOW_IDENT_in_createIndexStatement1372); 

                    }
                    break;

            }

            match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement1376); 
            cf=(Token)match(input,IDENT,FOLLOW_IDENT_in_createIndexStatement1380); 
            match(input,74,FOLLOW_74_in_createIndexStatement1382); 
            pushFollow(FOLLOW_term_in_createIndexStatement1386);
            columnName=term();

            state._fsp--;

            match(input,75,FOLLOW_75_in_createIndexStatement1388); 
            pushFollow(FOLLOW_endStmnt_in_createIndexStatement1390);
            endStmnt();

            state._fsp--;

             expr = new CreateIndexStatement((idxName!=null?idxName.getText():null), (cf!=null?cf.getText():null), columnName); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createIndexStatement"


    // $ANTLR start "dropKeyspaceStatement"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:254:1: dropKeyspaceStatement returns [String ksp] : K_DROP K_KEYSPACE IDENT endStmnt ;
    public final String dropKeyspaceStatement() throws RecognitionException {
        String ksp = null;

        Token IDENT20=null;

        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:256:5: ( K_DROP K_KEYSPACE IDENT endStmnt )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:256:7: K_DROP K_KEYSPACE IDENT endStmnt
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement1421); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement1423); 
            IDENT20=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropKeyspaceStatement1425); 
            pushFollow(FOLLOW_endStmnt_in_dropKeyspaceStatement1427);
            endStmnt();

            state._fsp--;

             ksp = (IDENT20!=null?IDENT20.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ksp;
    }
    // $ANTLR end "dropKeyspaceStatement"


    // $ANTLR start "dropColumnFamilyStatement"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:259:1: dropColumnFamilyStatement returns [String cfam] : K_DROP K_COLUMNFAMILY IDENT endStmnt ;
    public final String dropColumnFamilyStatement() throws RecognitionException {
        String cfam = null;

        Token IDENT21=null;

        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:261:5: ( K_DROP K_COLUMNFAMILY IDENT endStmnt )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:261:7: K_DROP K_COLUMNFAMILY IDENT endStmnt
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropColumnFamilyStatement1452); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropColumnFamilyStatement1454); 
            IDENT21=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropColumnFamilyStatement1456); 
            pushFollow(FOLLOW_endStmnt_in_dropColumnFamilyStatement1458);
            endStmnt();

            state._fsp--;

             cfam = (IDENT21!=null?IDENT21.getText():null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cfam;
    }
    // $ANTLR end "dropColumnFamilyStatement"

    public static class comparatorType_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "comparatorType"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:264:1: comparatorType : ( 'bytes' | 'ascii' | 'utf8' | 'int' | 'long' | 'uuid' | 'timeuuid' );
    public final CqlParser.comparatorType_return comparatorType() throws RecognitionException {
        CqlParser.comparatorType_return retval = new CqlParser.comparatorType_return();
        retval.start = input.LT(1);

        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:265:5: ( 'bytes' | 'ascii' | 'utf8' | 'int' | 'long' | 'uuid' | 'timeuuid' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:
            {
            if ( (input.LA(1)>=78 && input.LA(1)<=84) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparatorType"


    // $ANTLR start "term"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:268:1: term returns [Term item] : (t= timeuuid | t= literal ) ;
    public final Term term() throws RecognitionException {
        Term item = null;

        Term t = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:269:5: ( (t= timeuuid | t= literal ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:269:7: (t= timeuuid | t= literal )
            {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:269:7: (t= timeuuid | t= literal )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==90) ) {
                alt26=1;
            }
            else if ( (LA26_0==INTEGER||LA26_0==STRING_LITERAL||(LA26_0>=UNICODE && LA26_0<=UUID)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:269:9: t= timeuuid
                    {
                    pushFollow(FOLLOW_timeuuid_in_term1526);
                    t=timeuuid();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:269:22: t= literal
                    {
                    pushFollow(FOLLOW_literal_in_term1532);
                    t=literal();

                    state._fsp--;


                    }
                    break;

            }

             item = t; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return item;
    }
    // $ANTLR end "term"


    // $ANTLR start "literal"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:272:1: literal returns [Term term] : (t= STRING_LITERAL | t= INTEGER | t= UNICODE | t= UUID ) ;
    public final Term literal() throws RecognitionException {
        Term term = null;

        Token t=null;

        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:273:5: ( (t= STRING_LITERAL | t= INTEGER | t= UNICODE | t= UUID ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:273:7: (t= STRING_LITERAL | t= INTEGER | t= UNICODE | t= UUID )
            {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:273:7: (t= STRING_LITERAL | t= INTEGER | t= UNICODE | t= UUID )
            int alt27=4;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt27=1;
                }
                break;
            case INTEGER:
                {
                alt27=2;
                }
                break;
            case UNICODE:
                {
                alt27=3;
                }
                break;
            case UUID:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:273:9: t= STRING_LITERAL
                    {
                    t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal1561); 

                    }
                    break;
                case 2 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:273:28: t= INTEGER
                    {
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal1567); 

                    }
                    break;
                case 3 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:273:40: t= UNICODE
                    {
                    t=(Token)match(input,UNICODE,FOLLOW_UNICODE_in_literal1573); 

                    }
                    break;
                case 4 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:273:52: t= UUID
                    {
                    t=(Token)match(input,UUID,FOLLOW_UUID_in_literal1579); 

                    }
                    break;

            }

             term = new Term((t!=null?t.getText():null), (t!=null?t.getType():0)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return term;
    }
    // $ANTLR end "literal"


    // $ANTLR start "termList"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:276:1: termList returns [List<Term> items] : t1= term ( ',' tN= term )* ;
    public final List<Term> termList() throws RecognitionException {
        List<Term> items = null;

        Term t1 = null;

        Term tN = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:277:5: (t1= term ( ',' tN= term )* )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:277:7: t1= term ( ',' tN= term )*
            {
             items = new ArrayList<Term>(); 
            pushFollow(FOLLOW_term_in_termList1614);
            t1=term();

            state._fsp--;

             items.add(t1); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:278:35: ( ',' tN= term )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==76) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:278:36: ',' tN= term
            	    {
            	    match(input,76,FOLLOW_76_in_termList1619); 
            	    pushFollow(FOLLOW_term_in_termList1623);
            	    tN=term();

            	    state._fsp--;

            	     items.add(tN); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return items;
    }
    // $ANTLR end "termList"


    // $ANTLR start "termPair"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:282:1: termPair[Map<Term, Term> columns] : key= term '=' value= term ;
    public final void termPair(Map<Term, Term> columns) throws RecognitionException {
        Term key = null;

        Term value = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:283:5: (key= term '=' value= term )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:283:9: key= term '=' value= term
            {
            pushFollow(FOLLOW_term_in_termPair1650);
            key=term();

            state._fsp--;

            match(input,77,FOLLOW_77_in_termPair1652); 
            pushFollow(FOLLOW_term_in_termPair1656);
            value=term();

            state._fsp--;

             columns.put(key, value); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "termPair"


    // $ANTLR start "relation"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:287:1: relation returns [Relation rel] : ( K_KEY | name= term ) type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term ;
    public final Relation relation() throws RecognitionException {
        Relation rel = null;

        Token type=null;
        Term name = null;

        Term t = null;


        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:288:5: ( ( K_KEY | name= term ) type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:288:7: ( K_KEY | name= term ) type= ( '=' | '<' | '<=' | '>=' | '>' ) t= term
            {
             Term entity = new Term("KEY", STRING_LITERAL); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:289:7: ( K_KEY | name= term )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==K_KEY) ) {
                alt29=1;
            }
            else if ( (LA29_0==INTEGER||LA29_0==STRING_LITERAL||(LA29_0>=UNICODE && LA29_0<=UUID)||LA29_0==90) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:289:8: K_KEY
                    {
                    match(input,K_KEY,FOLLOW_K_KEY_in_relation1689); 

                    }
                    break;
                case 2 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:289:16: name= term
                    {
                    pushFollow(FOLLOW_term_in_relation1695);
                    name=term();

                    state._fsp--;

                     entity = name; 

                    }
                    break;

            }

            type=(Token)input.LT(1);
            if ( input.LA(1)==77||(input.LA(1)>=85 && input.LA(1)<=88) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_term_in_relation1725);
            t=term();

            state._fsp--;

             return new Relation(entity, (type!=null?type.getText():null), t); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return rel;
    }
    // $ANTLR end "relation"


    // $ANTLR start "truncateStatement"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:294:1: truncateStatement returns [String cfam] : K_TRUNCATE columnFamily= IDENT endStmnt ;
    public final String truncateStatement() throws RecognitionException {
        String cfam = null;

        Token columnFamily=null;

        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:295:5: ( K_TRUNCATE columnFamily= IDENT endStmnt )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:295:7: K_TRUNCATE columnFamily= IDENT endStmnt
            {
            match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement1755); 
            columnFamily=(Token)match(input,IDENT,FOLLOW_IDENT_in_truncateStatement1759); 
             cfam = (columnFamily!=null?columnFamily.getText():null); 
            pushFollow(FOLLOW_endStmnt_in_truncateStatement1763);
            endStmnt();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cfam;
    }
    // $ANTLR end "truncateStatement"


    // $ANTLR start "endStmnt"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:298:1: endStmnt : ( EOF | ';' ) ;
    public final void endStmnt() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:299:5: ( ( EOF | ';' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:299:7: ( EOF | ';' )
            {
            if ( input.LA(1)==EOF||input.LA(1)==89 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "endStmnt"


    // $ANTLR start "timeuuid"
    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:302:1: timeuuid returns [Term term] : 'timeuuid(' (uuidstr= ( STRING_LITERAL | INTEGER ) )? ')' ;
    public final Term timeuuid() throws RecognitionException {
        Term term = null;

        Token uuidstr=null;

        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:303:5: ( 'timeuuid(' (uuidstr= ( STRING_LITERAL | INTEGER ) )? ')' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:303:7: 'timeuuid(' (uuidstr= ( STRING_LITERAL | INTEGER ) )? ')'
            {
            match(input,90,FOLLOW_90_in_timeuuid1811); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:303:26: (uuidstr= ( STRING_LITERAL | INTEGER ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==INTEGER||LA30_0==STRING_LITERAL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:303:26: uuidstr= ( STRING_LITERAL | INTEGER )
                    {
                    uuidstr=(Token)input.LT(1);
                    if ( input.LA(1)==INTEGER||input.LA(1)==STRING_LITERAL ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            match(input,75,FOLLOW_75_in_timeuuid1826); 
             return new Term((uuidstr!=null?uuidstr.getText():null), TermType.TIMEUUID); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return term;
    }
    // $ANTLR end "timeuuid"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA1_eotS =
        "\16\uffff";
    static final String DFA1_eofS =
        "\16\uffff";
    static final String DFA1_minS =
        "\1\4\6\uffff\2\34\5\uffff";
    static final String DFA1_maxS =
        "\1\47\6\uffff\1\42\1\40\5\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\7\1\10\1\11\1\12\1\13";
    static final String DFA1_specialS =
        "\16\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\4\1\uffff\1\1\14\uffff\1\3\2\uffff\1\2\2\uffff\1\6\1\uffff"+
            "\1\7\10\uffff\1\10\2\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\3\uffff\1\12\1\uffff\1\13",
            "\1\14\3\uffff\1\15",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "58:1: query returns [CQLStatement stmnt] : ( selectStatement | updateStatement | batchUpdateStatement | useStatement | truncateStatement | deleteStatement | createKeyspaceStatement | createColumnFamilyStatement | createIndexStatement | dropKeyspaceStatement | dropColumnFamilyStatement );";
        }
    }
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\2\16\4\10\1\113\1\10\2\uffff";
    static final String DFA9_maxS =
        "\1\132\1\113\4\114\1\113\1\114\2\uffff";
    static final String DFA9_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\3\20\uffff\1\2\5\uffff\1\4\1\5\63\uffff\1\1",
            "\1\6\20\uffff\1\6\53\uffff\1\7",
            "\1\10\10\uffff\1\11\71\uffff\2\10",
            "\1\10\10\uffff\1\11\71\uffff\2\10",
            "\1\10\10\uffff\1\11\71\uffff\2\10",
            "\1\10\10\uffff\1\11\71\uffff\2\10",
            "\1\7",
            "\1\10\10\uffff\1\11\71\uffff\2\10",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "122:7: (first= term ( ',' next= term )* | start= term RANGEOP finish= term )";
        }
    }
 

    public static final BitSet FOLLOW_selectStatement_in_query64 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_query76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_batchUpdateStatement_in_query88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useStatement_in_query98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_query113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_query123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createKeyspaceStatement_in_query135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createColumnFamilyStatement_in_query145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createIndexStatement_in_query155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropKeyspaceStatement_in_query165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropColumnFamilyStatement_in_query175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USE_in_useStatement199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_useStatement201 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_endStmnt_in_useStatement205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SELECT_in_selectStatement236 = new BitSet(new long[]{0x000000608001C080L,0x0000000004000000L});
    public static final BitSet FOLLOW_selectExpression_in_selectStatement252 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_K_COUNT_in_selectStatement284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_selectStatement286 = new BitSet(new long[]{0x000000608001C000L,0x0000000004000000L});
    public static final BitSet FOLLOW_selectExpression_in_selectStatement290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_selectStatement292 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_K_FROM_in_selectStatement318 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_selectStatement322 = new BitSet(new long[]{0x0000000000003200L,0x0000000002000000L});
    public static final BitSet FOLLOW_K_USING_in_selectStatement336 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_CONSISTENCY_in_selectStatement338 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_K_LEVEL_in_selectStatement340 = new BitSet(new long[]{0x0000000000003000L,0x0000000002000000L});
    public static final BitSet FOLLOW_K_WHERE_in_selectStatement359 = new BitSet(new long[]{0x0000006081004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_whereClause_in_selectStatement361 = new BitSet(new long[]{0x0000000000002000L,0x0000000002000000L});
    public static final BitSet FOLLOW_K_LIMIT_in_selectStatement378 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_INTEGER_in_selectStatement382 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_endStmnt_in_selectStatement399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_FIRST_in_selectExpression440 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_INTEGER_in_selectExpression444 = new BitSet(new long[]{0x0000006080014000L,0x0000000004000000L});
    public static final BitSet FOLLOW_K_REVERSED_in_selectExpression459 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_term_in_selectExpression476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_selectExpression493 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_term_in_selectExpression497 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_term_in_selectExpression513 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RANGEOP_in_selectExpression515 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_term_in_selectExpression519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_whereClause553 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_K_AND_in_whereClause569 = new BitSet(new long[]{0x0000006081004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_relation_in_whereClause573 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_K_BEGIN_in_batchUpdateStatement608 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchUpdateStatement610 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_K_USING_in_batchUpdateStatement614 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_CONSISTENCY_in_batchUpdateStatement616 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_K_LEVEL_in_batchUpdateStatement618 = new BitSet(new long[]{0x0000000000400200L});
    public static final BitSet FOLLOW_updateStatement_in_batchUpdateStatement637 = new BitSet(new long[]{0x0000000000600200L});
    public static final BitSet FOLLOW_updateStatement_in_batchUpdateStatement645 = new BitSet(new long[]{0x0000000000600200L});
    public static final BitSet FOLLOW_K_APPLY_in_batchUpdateStatement658 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchUpdateStatement660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_batchUpdateStatement662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UPDATE_in_updateStatement701 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_updateStatement705 = new BitSet(new long[]{0x0000000000800200L});
    public static final BitSet FOLLOW_K_USING_in_updateStatement718 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_CONSISTENCY_in_updateStatement720 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_K_LEVEL_in_updateStatement722 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_K_SET_in_updateStatement738 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_termPair_in_updateStatement740 = new BitSet(new long[]{0x0000000000001000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_updateStatement744 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_termPair_in_updateStatement746 = new BitSet(new long[]{0x0000000000001000L,0x0000000000001000L});
    public static final BitSet FOLLOW_K_WHERE_in_updateStatement761 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_K_KEY_in_updateStatement763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_updateStatement765 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_term_in_updateStatement769 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_endStmnt_in_updateStatement771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DELETE_in_deleteStatement810 = new BitSet(new long[]{0x0000006080004100L,0x0000000004000000L});
    public static final BitSet FOLLOW_termList_in_deleteStatement826 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_K_FROM_in_deleteStatement842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_deleteStatement846 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_K_USING_in_deleteStatement850 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_CONSISTENCY_in_deleteStatement852 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_K_LEVEL_in_deleteStatement854 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_K_WHERE_in_deleteStatement869 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_K_KEY_in_deleteStatement873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_deleteStatement875 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_term_in_deleteStatement879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_KEY_in_deleteStatement913 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_IN_in_deleteStatement915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_deleteStatement917 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_termList_in_deleteStatement921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_deleteStatement925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement985 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement987 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createKeyspaceStatement991 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement1003 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_set_in_createKeyspaceStatement1008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_createKeyspaceStatement1018 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_set_in_createKeyspaceStatement1022 = new BitSet(new long[]{0x0000000000040000L,0x0000000002000000L});
    public static final BitSet FOLLOW_K_AND_in_createKeyspaceStatement1046 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_set_in_createKeyspaceStatement1050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_createKeyspaceStatement1060 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_set_in_createKeyspaceStatement1064 = new BitSet(new long[]{0x0000000000040000L,0x0000000002000000L});
    public static final BitSet FOLLOW_endStmnt_in_createKeyspaceStatement1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createColumnFamilyStatement1124 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createColumnFamilyStatement1126 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createColumnFamilyStatement1130 = new BitSet(new long[]{0x0000000020000000L,0x0000000002000400L});
    public static final BitSet FOLLOW_74_in_createColumnFamilyStatement1136 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_term_in_createColumnFamilyStatement1150 = new BitSet(new long[]{0x0000000080000000L,0x00000000001FC000L});
    public static final BitSet FOLLOW_createCfamColumnValidator_in_createColumnFamilyStatement1154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_76_in_createColumnFamilyStatement1160 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_term_in_createColumnFamilyStatement1174 = new BitSet(new long[]{0x0000000080000000L,0x00000000001FC000L});
    public static final BitSet FOLLOW_createCfamColumnValidator_in_createColumnFamilyStatement1178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_createColumnFamilyStatement1191 = new BitSet(new long[]{0x0000000020000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_K_WITH_in_createColumnFamilyStatement1204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createColumnFamilyStatement1208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_createColumnFamilyStatement1210 = new BitSet(new long[]{0x0000000280004000L,0x00000000001FC000L});
    public static final BitSet FOLLOW_createCfamKeywordArgument_in_createColumnFamilyStatement1214 = new BitSet(new long[]{0x0000000000040000L,0x0000000002000000L});
    public static final BitSet FOLLOW_K_AND_in_createColumnFamilyStatement1230 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createColumnFamilyStatement1234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_createColumnFamilyStatement1236 = new BitSet(new long[]{0x0000000280004000L,0x00000000001FC000L});
    public static final BitSet FOLLOW_createCfamKeywordArgument_in_createColumnFamilyStatement1240 = new BitSet(new long[]{0x0000000000040000L,0x0000000002000000L});
    public static final BitSet FOLLOW_endStmnt_in_createColumnFamilyStatement1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparatorType_in_createCfamColumnValidator1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_createCfamColumnValidator1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparatorType_in_createCfamKeywordArgument1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_createCfamKeywordArgument1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement1365 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement1367 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_IDENT_in_createIndexStatement1372 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_K_ON_in_createIndexStatement1376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_createIndexStatement1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_createIndexStatement1382 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_term_in_createIndexStatement1386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_createIndexStatement1388 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_endStmnt_in_createIndexStatement1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement1421 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement1423 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_dropKeyspaceStatement1425 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_endStmnt_in_dropKeyspaceStatement1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropColumnFamilyStatement1452 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropColumnFamilyStatement1454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_dropColumnFamilyStatement1456 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_endStmnt_in_dropColumnFamilyStatement1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comparatorType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeuuid_in_term1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_term1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_literal1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNICODE_in_literal1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UUID_in_literal1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termList1614 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_termList1619 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_term_in_termList1623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_term_in_termPair1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_termPair1652 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_term_in_termPair1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_KEY_in_relation1689 = new BitSet(new long[]{0x0000000000000000L,0x0000000001E02000L});
    public static final BitSet FOLLOW_term_in_relation1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000001E02000L});
    public static final BitSet FOLLOW_set_in_relation1703 = new BitSet(new long[]{0x0000006080004000L,0x0000000004000000L});
    public static final BitSet FOLLOW_term_in_relation1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement1755 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_truncateStatement1759 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_endStmnt_in_truncateStatement1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_endStmnt1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_timeuuid1811 = new BitSet(new long[]{0x0000000080004000L,0x0000000000000800L});
    public static final BitSet FOLLOW_set_in_timeuuid1815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_timeuuid1826 = new BitSet(new long[]{0x0000000000000002L});

}