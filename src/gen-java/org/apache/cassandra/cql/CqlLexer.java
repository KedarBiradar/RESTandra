// $ANTLR 3.2 Sep 23, 2009 12:02:23 /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g 2011-03-10 01:53:35

    package org.apache.cassandra.cql;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlLexer extends Lexer {
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
    public static final int K_USE=4;
    public static final int MULTILINE_COMMENT=73;
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
    public static final int K_UPDATE=22;
    public static final int J=66;
    public static final int K=54;
    public static final int K_CONSISTENCY=10;
    public static final int U=56;
    public static final int K_WITH=29;
    public static final int COMPIDENT=30;
    public static final int T=44;
    public static final int W=49;
    public static final int V=63;
    public static final int Q=62;
    public static final int P=58;
    public static final int K_IN=26;
    public static final int S=40;
    public static final int R=46;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int UNICODE=37;
    public static final int Y=55;
    public static final int T__88=88;
    public static final int X=65;
    public static final int K_FROM=8;
    public static final int Z=67;
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
    public static final int K_LEVEL=11;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int K_BATCH=20;
    public static final int T__77=77;

        List<Token> tokens = new ArrayList<Token>();
        
        public void emit(Token token) {
            state.token = token;
            tokens.add(token);
        }
        
        public Token nextToken() {
            super.nextToken();
            if (tokens.size() == 0)
                return Token.EOF_TOKEN;
            return tokens.remove(0);
        }


    // delegates
    // delegators

    public CqlLexer() {;} 
    public CqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g"; }

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:26:7: ( '(' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:26:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:27:7: ( ')' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:27:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:28:7: ( ',' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:28:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:29:7: ( '=' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:30:7: ( 'bytes' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:30:9: 'bytes'
            {
            match("bytes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:31:7: ( 'ascii' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:31:9: 'ascii'
            {
            match("ascii"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:32:7: ( 'utf8' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:32:9: 'utf8'
            {
            match("utf8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:33:7: ( 'int' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:33:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:34:7: ( 'long' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:34:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:35:7: ( 'uuid' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:35:9: 'uuid'
            {
            match("uuid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:36:7: ( 'timeuuid' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:36:9: 'timeuuid'
            {
            match("timeuuid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:37:7: ( '<' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:37:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:38:7: ( '<=' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:38:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:39:7: ( '>=' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:39:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:40:7: ( '>' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:40:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:41:7: ( ';' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:41:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:42:7: ( 'timeuuid(' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:42:9: 'timeuuid('
            {
            match("timeuuid("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "K_SELECT"
    public final void mK_SELECT() throws RecognitionException {
        try {
            int _type = K_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:308:9: ( S E L E C T )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:308:16: S E L E C T
            {
            mS(); 
            mE(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SELECT"

    // $ANTLR start "K_FROM"
    public final void mK_FROM() throws RecognitionException {
        try {
            int _type = K_FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:309:7: ( F R O M )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:309:16: F R O M
            {
            mF(); 
            mR(); 
            mO(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_FROM"

    // $ANTLR start "K_WHERE"
    public final void mK_WHERE() throws RecognitionException {
        try {
            int _type = K_WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:310:8: ( W H E R E )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:310:16: W H E R E
            {
            mW(); 
            mH(); 
            mE(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_WHERE"

    // $ANTLR start "K_AND"
    public final void mK_AND() throws RecognitionException {
        try {
            int _type = K_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:311:6: ( A N D )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:311:16: A N D
            {
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_AND"

    // $ANTLR start "K_KEY"
    public final void mK_KEY() throws RecognitionException {
        try {
            int _type = K_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:312:6: ( K E Y )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:312:16: K E Y
            {
            mK(); 
            mE(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_KEY"

    // $ANTLR start "K_COLUMN"
    public final void mK_COLUMN() throws RecognitionException {
        try {
            int _type = K_COLUMN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:313:9: ( C O L ( U M N )? )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:313:16: C O L ( U M N )?
            {
            mC(); 
            mO(); 
            mL(); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:313:22: ( U M N )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='U'||LA1_0=='u') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:313:23: U M N
                    {
                    mU(); 
                    mM(); 
                    mN(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COLUMN"

    // $ANTLR start "K_UPDATE"
    public final void mK_UPDATE() throws RecognitionException {
        try {
            int _type = K_UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:314:9: ( U P D A T E )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:314:16: U P D A T E
            {
            mU(); 
            mP(); 
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_UPDATE"

    // $ANTLR start "K_WITH"
    public final void mK_WITH() throws RecognitionException {
        try {
            int _type = K_WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:315:7: ( W I T H )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:315:16: W I T H
            {
            mW(); 
            mI(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_WITH"

    // $ANTLR start "K_ROW"
    public final void mK_ROW() throws RecognitionException {
        try {
            int _type = K_ROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:316:6: ( R O W )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:316:16: R O W
            {
            mR(); 
            mO(); 
            mW(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ROW"

    // $ANTLR start "K_LIMIT"
    public final void mK_LIMIT() throws RecognitionException {
        try {
            int _type = K_LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:317:8: ( L I M I T )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:317:16: L I M I T
            {
            mL(); 
            mI(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_LIMIT"

    // $ANTLR start "K_USING"
    public final void mK_USING() throws RecognitionException {
        try {
            int _type = K_USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:318:8: ( U S I N G )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:318:16: U S I N G
            {
            mU(); 
            mS(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_USING"

    // $ANTLR start "K_CONSISTENCY"
    public final void mK_CONSISTENCY() throws RecognitionException {
        try {
            int _type = K_CONSISTENCY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:319:14: ( C O N S I S T E N C Y )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:319:16: C O N S I S T E N C Y
            {
            mC(); 
            mO(); 
            mN(); 
            mS(); 
            mI(); 
            mS(); 
            mT(); 
            mE(); 
            mN(); 
            mC(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CONSISTENCY"

    // $ANTLR start "K_LEVEL"
    public final void mK_LEVEL() throws RecognitionException {
        try {
            int _type = K_LEVEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:320:8: ( ( O N E | Q U O R U M | A L L | D C Q U O R U M | D C Q U O R U M S Y N C ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:320:16: ( O N E | Q U O R U M | A L L | D C Q U O R U M | D C Q U O R U M S Y N C )
            {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:320:16: ( O N E | Q U O R U M | A L L | D C Q U O R U M | D C Q U O R U M S Y N C )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:320:18: O N E
                    {
                    mO(); 
                    mN(); 
                    mE(); 

                    }
                    break;
                case 2 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:321:18: Q U O R U M
                    {
                    mQ(); 
                    mU(); 
                    mO(); 
                    mR(); 
                    mU(); 
                    mM(); 

                    }
                    break;
                case 3 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:322:18: A L L
                    {
                    mA(); 
                    mL(); 
                    mL(); 

                    }
                    break;
                case 4 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:323:18: D C Q U O R U M
                    {
                    mD(); 
                    mC(); 
                    mQ(); 
                    mU(); 
                    mO(); 
                    mR(); 
                    mU(); 
                    mM(); 

                    }
                    break;
                case 5 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:324:18: D C Q U O R U M S Y N C
                    {
                    mD(); 
                    mC(); 
                    mQ(); 
                    mU(); 
                    mO(); 
                    mR(); 
                    mU(); 
                    mM(); 
                    mS(); 
                    mY(); 
                    mN(); 
                    mC(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_LEVEL"

    // $ANTLR start "K_USE"
    public final void mK_USE() throws RecognitionException {
        try {
            int _type = K_USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:327:6: ( U S E )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:327:16: U S E
            {
            mU(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_USE"

    // $ANTLR start "K_FIRST"
    public final void mK_FIRST() throws RecognitionException {
        try {
            int _type = K_FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:328:8: ( F I R S T )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:328:16: F I R S T
            {
            mF(); 
            mI(); 
            mR(); 
            mS(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_FIRST"

    // $ANTLR start "K_REVERSED"
    public final void mK_REVERSED() throws RecognitionException {
        try {
            int _type = K_REVERSED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:329:11: ( R E V E R S E D )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:329:16: R E V E R S E D
            {
            mR(); 
            mE(); 
            mV(); 
            mE(); 
            mR(); 
            mS(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_REVERSED"

    // $ANTLR start "K_COUNT"
    public final void mK_COUNT() throws RecognitionException {
        try {
            int _type = K_COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:330:8: ( C O U N T )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:330:16: C O U N T
            {
            mC(); 
            mO(); 
            mU(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COUNT"

    // $ANTLR start "K_SET"
    public final void mK_SET() throws RecognitionException {
        try {
            int _type = K_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:331:6: ( S E T )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:331:16: S E T
            {
            mS(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SET"

    // $ANTLR start "K_BEGIN"
    public final void mK_BEGIN() throws RecognitionException {
        try {
            int _type = K_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:332:8: ( B E G I N )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:332:16: B E G I N
            {
            mB(); 
            mE(); 
            mG(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BEGIN"

    // $ANTLR start "K_APPLY"
    public final void mK_APPLY() throws RecognitionException {
        try {
            int _type = K_APPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:333:8: ( A P P L Y )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:333:16: A P P L Y
            {
            mA(); 
            mP(); 
            mP(); 
            mL(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_APPLY"

    // $ANTLR start "K_BATCH"
    public final void mK_BATCH() throws RecognitionException {
        try {
            int _type = K_BATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:334:8: ( B A T C H )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:334:16: B A T C H
            {
            mB(); 
            mA(); 
            mT(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BATCH"

    // $ANTLR start "K_TRUNCATE"
    public final void mK_TRUNCATE() throws RecognitionException {
        try {
            int _type = K_TRUNCATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:335:11: ( T R U N C A T E )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:335:16: T R U N C A T E
            {
            mT(); 
            mR(); 
            mU(); 
            mN(); 
            mC(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TRUNCATE"

    // $ANTLR start "K_DELETE"
    public final void mK_DELETE() throws RecognitionException {
        try {
            int _type = K_DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:336:9: ( D E L E T E )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:336:16: D E L E T E
            {
            mD(); 
            mE(); 
            mL(); 
            mE(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DELETE"

    // $ANTLR start "K_IN"
    public final void mK_IN() throws RecognitionException {
        try {
            int _type = K_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:337:5: ( I N )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:337:16: I N
            {
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_IN"

    // $ANTLR start "K_CREATE"
    public final void mK_CREATE() throws RecognitionException {
        try {
            int _type = K_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:338:9: ( C R E A T E )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:338:16: C R E A T E
            {
            mC(); 
            mR(); 
            mE(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CREATE"

    // $ANTLR start "K_KEYSPACE"
    public final void mK_KEYSPACE() throws RecognitionException {
        try {
            int _type = K_KEYSPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:339:11: ( K E Y S P A C E )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:339:16: K E Y S P A C E
            {
            mK(); 
            mE(); 
            mY(); 
            mS(); 
            mP(); 
            mA(); 
            mC(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_KEYSPACE"

    // $ANTLR start "K_COLUMNFAMILY"
    public final void mK_COLUMNFAMILY() throws RecognitionException {
        try {
            int _type = K_COLUMNFAMILY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:340:15: ( C O L U M N F A M I L Y )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:340:17: C O L U M N F A M I L Y
            {
            mC(); 
            mO(); 
            mL(); 
            mU(); 
            mM(); 
            mN(); 
            mF(); 
            mA(); 
            mM(); 
            mI(); 
            mL(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COLUMNFAMILY"

    // $ANTLR start "K_INDEX"
    public final void mK_INDEX() throws RecognitionException {
        try {
            int _type = K_INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:341:8: ( I N D E X )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:341:16: I N D E X
            {
            mI(); 
            mN(); 
            mD(); 
            mE(); 
            mX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INDEX"

    // $ANTLR start "K_ON"
    public final void mK_ON() throws RecognitionException {
        try {
            int _type = K_ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:342:5: ( O N )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:342:16: O N
            {
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ON"

    // $ANTLR start "K_DROP"
    public final void mK_DROP() throws RecognitionException {
        try {
            int _type = K_DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:343:7: ( D R O P )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:343:16: D R O P
            {
            mD(); 
            mR(); 
            mO(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DROP"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:346:11: ( ( 'a' | 'A' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:346:13: ( 'a' | 'A' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:347:11: ( ( 'b' | 'B' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:347:13: ( 'b' | 'B' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:348:11: ( ( 'c' | 'C' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:348:13: ( 'c' | 'C' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:349:11: ( ( 'd' | 'D' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:349:13: ( 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:350:11: ( ( 'e' | 'E' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:350:13: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:351:11: ( ( 'f' | 'F' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:351:13: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:352:11: ( ( 'g' | 'G' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:352:13: ( 'g' | 'G' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:353:11: ( ( 'h' | 'H' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:353:13: ( 'h' | 'H' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:354:11: ( ( 'i' | 'I' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:354:13: ( 'i' | 'I' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:355:11: ( ( 'j' | 'J' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:355:13: ( 'j' | 'J' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:356:11: ( ( 'k' | 'K' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:356:13: ( 'k' | 'K' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:357:11: ( ( 'l' | 'L' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:357:13: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:358:11: ( ( 'm' | 'M' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:358:13: ( 'm' | 'M' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:359:11: ( ( 'n' | 'N' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:359:13: ( 'n' | 'N' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:360:11: ( ( 'o' | 'O' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:360:13: ( 'o' | 'O' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:361:11: ( ( 'p' | 'P' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:361:13: ( 'p' | 'P' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:362:11: ( ( 'q' | 'Q' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:362:13: ( 'q' | 'Q' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:363:11: ( ( 'r' | 'R' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:363:13: ( 'r' | 'R' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:364:11: ( ( 's' | 'S' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:364:13: ( 's' | 'S' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:365:11: ( ( 't' | 'T' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:365:13: ( 't' | 'T' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:366:11: ( ( 'u' | 'U' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:366:13: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:367:11: ( ( 'v' | 'V' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:367:13: ( 'v' | 'V' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:368:11: ( ( 'w' | 'W' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:368:13: ( 'w' | 'W' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:369:11: ( ( 'x' | 'X' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:369:13: ( 'x' | 'X' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:370:11: ( ( 'y' | 'Y' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:370:13: ( 'y' | 'Y' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:371:11: ( ( 'z' | 'Z' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:371:13: ( 'z' | 'Z' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:374:5: ( '\\'' (c=~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\'' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:374:7: '\\'' (c=~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )* '\\''
            {
            match('\''); 
             StringBuilder b = new StringBuilder(); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:376:7: (c=~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\'') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='\'') ) {
                        alt3=2;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:376:9: c=~ ( '\\'' | '\\r' | '\\n' )
            	    {
            	    c= input.LA(1);
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	     b.appendCodePoint(c);

            	    }
            	    break;
            	case 2 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:377:9: '\\'' '\\''
            	    {
            	    match('\''); 
            	    match('\''); 
            	     b.appendCodePoint('"');

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\''); 
             setText(b.toString()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:384:5: ( '0' .. '9' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:384:7: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:388:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:388:7: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:392:5: ( ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:392:7: ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "RANGEOP"
    public final void mRANGEOP() throws RecognitionException {
        try {
            int _type = RANGEOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:396:5: ( '..' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:396:7: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANGEOP"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:400:5: ( ( DIGIT )+ )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:400:7: ( DIGIT )+
            {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:400:7: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:400:7: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken d=null;
            CommonToken r=null;

            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:407:5: (d= INTEGER r= RANGEOP | INTEGER '.' INTEGER )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:407:7: d= INTEGER r= RANGEOP
                    {
                    int dStart1555 = getCharIndex();
                    mINTEGER(); 
                    d = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, dStart1555, getCharIndex()-1);
                    int rStart1559 = getCharIndex();
                    mRANGEOP(); 
                    r = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, rStart1559, getCharIndex()-1);

                              d.setType(INTEGER);
                              emit(d);
                              r.setType(RANGEOP);
                              emit(r);
                          

                    }
                    break;
                case 2 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:414:9: INTEGER '.' INTEGER
                    {
                    mINTEGER(); 
                    match('.'); 
                    mINTEGER(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:418:5: ( LETTER ( LETTER | DIGIT | '_' )* )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:418:7: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:418:14: ( LETTER | DIGIT | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "COMPIDENT"
    public final void mCOMPIDENT() throws RecognitionException {
        try {
            int _type = COMPIDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:422:5: ( IDENT ( ':' IDENT )* )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:422:7: IDENT ( ':' IDENT )*
            {
            mIDENT(); 
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:422:13: ( ':' IDENT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==':') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:422:15: ':' IDENT
            	    {
            	    match(':'); 
            	    mIDENT(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPIDENT"

    // $ANTLR start "UNICODE"
    public final void mUNICODE() throws RecognitionException {
        try {
            int _type = UNICODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:426:5: ( 'u' STRING_LITERAL )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:426:7: 'u' STRING_LITERAL
            {
            match('u'); 
            mSTRING_LITERAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNICODE"

    // $ANTLR start "UUID"
    public final void mUUID() throws RecognitionException {
        try {
            int _type = UUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:430:5: ( HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:430:7: HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX
            {
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UUID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:438:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:438:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:438:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:442:5: ( ( '--' | '//' ) ( . )* ( '\\n' | '\\r' ) )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:442:7: ( '--' | '//' ) ( . )* ( '\\n' | '\\r' )
            {
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:442:7: ( '--' | '//' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='-') ) {
                alt9=1;
            }
            else if ( (LA9_0=='/') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:442:8: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 2 :
                    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:442:15: '//'
                    {
                    match("//"); 


                    }
                    break;

            }

            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:442:21: ( . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                    alt10=2;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:442:21: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "MULTILINE_COMMENT"
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:446:5: ( '/*' ( . )* '*/' )
            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:446:7: '/*' ( . )* '*/'
            {
            match("/*"); 

            // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:446:12: ( . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:446:12: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTILINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:8: ( T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | K_SELECT | K_FROM | K_WHERE | K_AND | K_KEY | K_COLUMN | K_UPDATE | K_WITH | K_ROW | K_LIMIT | K_USING | K_CONSISTENCY | K_LEVEL | K_USE | K_FIRST | K_REVERSED | K_COUNT | K_SET | K_BEGIN | K_APPLY | K_BATCH | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_COLUMNFAMILY | K_INDEX | K_ON | K_DROP | STRING_LITERAL | RANGEOP | INTEGER | FLOAT | IDENT | COMPIDENT | UNICODE | UUID | WS | COMMENT | MULTILINE_COMMENT )
        int alt12=58;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:10: T__74
                {
                mT__74(); 

                }
                break;
            case 2 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:16: T__75
                {
                mT__75(); 

                }
                break;
            case 3 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:22: T__76
                {
                mT__76(); 

                }
                break;
            case 4 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:28: T__77
                {
                mT__77(); 

                }
                break;
            case 5 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:34: T__78
                {
                mT__78(); 

                }
                break;
            case 6 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:40: T__79
                {
                mT__79(); 

                }
                break;
            case 7 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:46: T__80
                {
                mT__80(); 

                }
                break;
            case 8 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:52: T__81
                {
                mT__81(); 

                }
                break;
            case 9 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:58: T__82
                {
                mT__82(); 

                }
                break;
            case 10 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:64: T__83
                {
                mT__83(); 

                }
                break;
            case 11 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:70: T__84
                {
                mT__84(); 

                }
                break;
            case 12 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:76: T__85
                {
                mT__85(); 

                }
                break;
            case 13 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:82: T__86
                {
                mT__86(); 

                }
                break;
            case 14 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:88: T__87
                {
                mT__87(); 

                }
                break;
            case 15 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:94: T__88
                {
                mT__88(); 

                }
                break;
            case 16 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:100: T__89
                {
                mT__89(); 

                }
                break;
            case 17 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:106: T__90
                {
                mT__90(); 

                }
                break;
            case 18 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:112: K_SELECT
                {
                mK_SELECT(); 

                }
                break;
            case 19 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:121: K_FROM
                {
                mK_FROM(); 

                }
                break;
            case 20 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:128: K_WHERE
                {
                mK_WHERE(); 

                }
                break;
            case 21 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:136: K_AND
                {
                mK_AND(); 

                }
                break;
            case 22 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:142: K_KEY
                {
                mK_KEY(); 

                }
                break;
            case 23 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:148: K_COLUMN
                {
                mK_COLUMN(); 

                }
                break;
            case 24 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:157: K_UPDATE
                {
                mK_UPDATE(); 

                }
                break;
            case 25 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:166: K_WITH
                {
                mK_WITH(); 

                }
                break;
            case 26 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:173: K_ROW
                {
                mK_ROW(); 

                }
                break;
            case 27 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:179: K_LIMIT
                {
                mK_LIMIT(); 

                }
                break;
            case 28 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:187: K_USING
                {
                mK_USING(); 

                }
                break;
            case 29 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:195: K_CONSISTENCY
                {
                mK_CONSISTENCY(); 

                }
                break;
            case 30 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:209: K_LEVEL
                {
                mK_LEVEL(); 

                }
                break;
            case 31 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:217: K_USE
                {
                mK_USE(); 

                }
                break;
            case 32 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:223: K_FIRST
                {
                mK_FIRST(); 

                }
                break;
            case 33 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:231: K_REVERSED
                {
                mK_REVERSED(); 

                }
                break;
            case 34 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:242: K_COUNT
                {
                mK_COUNT(); 

                }
                break;
            case 35 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:250: K_SET
                {
                mK_SET(); 

                }
                break;
            case 36 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:256: K_BEGIN
                {
                mK_BEGIN(); 

                }
                break;
            case 37 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:264: K_APPLY
                {
                mK_APPLY(); 

                }
                break;
            case 38 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:272: K_BATCH
                {
                mK_BATCH(); 

                }
                break;
            case 39 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:280: K_TRUNCATE
                {
                mK_TRUNCATE(); 

                }
                break;
            case 40 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:291: K_DELETE
                {
                mK_DELETE(); 

                }
                break;
            case 41 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:300: K_IN
                {
                mK_IN(); 

                }
                break;
            case 42 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:305: K_CREATE
                {
                mK_CREATE(); 

                }
                break;
            case 43 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:314: K_KEYSPACE
                {
                mK_KEYSPACE(); 

                }
                break;
            case 44 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:325: K_COLUMNFAMILY
                {
                mK_COLUMNFAMILY(); 

                }
                break;
            case 45 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:340: K_INDEX
                {
                mK_INDEX(); 

                }
                break;
            case 46 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:348: K_ON
                {
                mK_ON(); 

                }
                break;
            case 47 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:353: K_DROP
                {
                mK_DROP(); 

                }
                break;
            case 48 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:360: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 49 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:375: RANGEOP
                {
                mRANGEOP(); 

                }
                break;
            case 50 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:383: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 51 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:391: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 52 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:397: IDENT
                {
                mIDENT(); 

                }
                break;
            case 53 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:403: COMPIDENT
                {
                mCOMPIDENT(); 

                }
                break;
            case 54 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:413: UNICODE
                {
                mUNICODE(); 

                }
                break;
            case 55 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:421: UUID
                {
                mUUID(); 

                }
                break;
            case 56 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:426: WS
                {
                mWS(); 

                }
                break;
            case 57 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:429: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 58 :
                // /media/Restandra/idea/cassandraR/src/java/org/apache/cassandra/cql/Cql.g:1:437: MULTILINE_COMMENT
                {
                mMULTILINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA2_eotS =
        "\13\uffff\1\14\2\uffff";
    static final String DFA2_eofS =
        "\16\uffff";
    static final String DFA2_minS =
        "\1\101\3\uffff\1\103\1\121\1\125\1\117\1\122\1\125\1\115\1\123\2"+
        "\uffff";
    static final String DFA2_maxS =
        "\1\161\3\uffff\1\143\1\161\1\165\1\157\1\162\1\165\1\155\1\163\2"+
        "\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\10\uffff\1\4\1\5";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\2\uffff\1\4\12\uffff\1\1\1\uffff\1\2\17\uffff\1\3\2\uffff"+
            "\1\4\12\uffff\1\1\1\uffff\1\2",
            "",
            "",
            "",
            "\1\5\37\uffff\1\5",
            "\1\6\37\uffff\1\6",
            "\1\7\37\uffff\1\7",
            "\1\10\37\uffff\1\10",
            "\1\11\37\uffff\1\11",
            "\1\12\37\uffff\1\12",
            "\1\13\37\uffff\1\13",
            "\1\15\37\uffff\1\15",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "320:16: ( O N E | Q U O R U M | A L L | D C Q U O R U M | D C Q U O R U M S Y N C )";
        }
    }
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\1\60\2\56\2\uffff";
    static final String DFA5_maxS =
        "\3\71\2\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\4",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "406:1: FLOAT : (d= INTEGER r= RANGEOP | INTEGER '.' INTEGER );";
        }
    }
    static final String DFA12_eotS =
        "\5\uffff\6\46\1\74\1\76\1\uffff\17\46\2\uffff\1\116\2\46\3\uffff"+
        "\1\46\1\uffff\1\46\1\uffff\13\46\1\uffff\2\141\4\46\4\uffff\12\46"+
        "\1\164\4\46\2\uffff\1\116\2\uffff\5\46\1\u0080\1\46\1\u0082\4\46"+
        "\1\u0087\1\u0088\1\uffff\6\46\1\u008f\4\46\1\u0094\1\46\1\u0097"+
        "\3\46\1\u009c\1\uffff\1\u0080\4\46\1\116\5\46\1\uffff\1\46\1\uffff"+
        "\1\u00a8\1\u00a9\2\46\2\uffff\1\46\1\u00ad\4\46\1\uffff\1\u00b2"+
        "\2\46\1\u00b5\1\uffff\2\46\1\uffff\4\46\1\uffff\3\46\1\u00bf\1\116"+
        "\1\u00c1\1\u00c2\1\46\1\u00c4\1\u00c5\1\u00c6\2\uffff\1\46\1\u00c8"+
        "\1\u00c9\1\uffff\1\u00ca\3\46\1\uffff\1\u00ce\1\u00cf\1\uffff\3"+
        "\46\1\u00d3\5\46\1\uffff\1\116\2\uffff\1\46\3\uffff\1\u00db\3\uffff"+
        "\2\46\1\u00de\2\uffff\2\46\1\u0097\1\uffff\1\u00e2\1\46\1\u0080"+
        "\1\46\1\u00e5\1\116\1\46\1\uffff\2\46\1\uffff\3\46\1\uffff\2\46"+
        "\1\uffff\1\116\1\46\1\u00f1\1\u00f2\1\u00f3\2\46\1\u00f6\1\u0080"+
        "\1\116\4\uffff\2\46\1\uffff\1\46\1\116\3\46\1\u00ff\2\46\1\uffff"+
        "\1\u0102\1\u0080\1\uffff";
    static final String DFA12_eofS =
        "\u0103\uffff";
    static final String DFA12_minS =
        "\1\11\4\uffff\2\60\1\47\3\60\2\75\1\uffff\17\60\2\uffff\1\56\2\60"+
        "\2\uffff\1\52\1\60\1\uffff\1\60\1\uffff\13\60\1\uffff\6\60\4\uffff"+
        "\17\60\2\uffff\1\56\2\uffff\16\60\1\uffff\22\60\1\uffff\5\60\1\56"+
        "\5\60\1\uffff\1\60\1\uffff\4\60\2\uffff\6\60\1\uffff\4\60\1\uffff"+
        "\2\60\1\uffff\4\60\1\uffff\4\60\1\56\6\60\2\uffff\3\60\1\uffff\4"+
        "\60\1\uffff\2\60\1\uffff\11\60\1\uffff\1\56\2\uffff\1\60\3\uffff"+
        "\1\60\3\uffff\3\60\2\uffff\3\60\1\uffff\5\60\1\56\1\60\1\uffff\2"+
        "\60\1\uffff\3\60\1\uffff\2\60\1\uffff\1\56\1\55\1\50\6\60\1\55\4"+
        "\uffff\2\60\1\uffff\1\60\1\56\6\60\1\uffff\2\60\1\uffff";
    static final String DFA12_maxS =
        "\1\172\4\uffff\6\172\2\75\1\uffff\17\172\2\uffff\1\146\2\172\2\uffff"+
        "\1\57\1\172\1\uffff\1\172\1\uffff\13\172\1\uffff\6\172\4\uffff\17"+
        "\172\2\uffff\1\146\2\uffff\16\172\1\uffff\22\172\1\uffff\5\172\1"+
        "\146\5\172\1\uffff\1\172\1\uffff\4\172\2\uffff\6\172\1\uffff\4\172"+
        "\1\uffff\2\172\1\uffff\4\172\1\uffff\4\172\1\146\6\172\2\uffff\3"+
        "\172\1\uffff\4\172\1\uffff\2\172\1\uffff\11\172\1\uffff\1\146\2"+
        "\uffff\1\172\3\uffff\1\172\3\uffff\3\172\2\uffff\3\172\1\uffff\5"+
        "\172\1\146\1\172\1\uffff\2\172\1\uffff\3\172\1\uffff\2\172\1\uffff"+
        "\1\146\10\172\1\71\4\uffff\2\172\1\uffff\1\172\1\71\6\172\1\uffff"+
        "\2\172\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\10\uffff\1\20\17\uffff\1\60\1\61\3\uffff"+
        "\1\70\1\71\2\uffff\1\64\1\uffff\1\65\13\uffff\1\66\6\uffff\1\15"+
        "\1\14\1\16\1\17\17\uffff\1\62\1\63\1\uffff\1\67\1\72\16\uffff\1"+
        "\51\22\uffff\1\56\13\uffff\1\36\1\uffff\1\25\4\uffff\1\37\1\10\6"+
        "\uffff\1\43\4\uffff\1\26\2\uffff\1\27\4\uffff\1\32\13\uffff\1\7"+
        "\1\12\3\uffff\1\11\4\uffff\1\23\2\uffff\1\31\11\uffff\1\57\1\uffff"+
        "\1\5\1\44\1\uffff\1\46\1\6\1\45\1\uffff\1\34\1\55\1\33\3\uffff\1"+
        "\40\1\24\3\uffff\1\42\7\uffff\1\30\2\uffff\1\22\3\uffff\1\52\2\uffff"+
        "\1\50\12\uffff\1\21\1\13\1\47\1\53\2\uffff\1\41\10\uffff\1\35\2"+
        "\uffff\1\54";
    static final String DFA12_specialS =
        "\u0103\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\6\uffff\1\35\1\1\1\2\2\uffff"+
            "\1\3\1\43\1\36\1\44\12\37\1\uffff\1\15\1\13\1\4\1\14\2\uffff"+
            "\1\21\1\32\1\23\1\31\1\40\1\17\2\41\1\34\1\41\1\22\1\26\2\41"+
            "\1\27\1\41\1\30\1\25\1\16\1\33\1\24\1\41\1\20\3\41\6\uffff\1"+
            "\6\1\5\1\23\1\31\1\40\1\17\2\41\1\10\1\41\1\22\1\11\2\41\1\27"+
            "\1\41\1\30\1\25\1\16\1\12\1\7\1\41\1\20\3\41",
            "",
            "",
            "",
            "",
            "\12\53\1\50\6\uffff\1\51\3\53\1\47\1\53\24\52\4\uffff\1\52"+
            "\1\uffff\1\51\3\53\1\47\1\53\22\52\1\45\1\52",
            "\12\53\1\50\6\uffff\6\53\5\52\1\55\1\52\1\57\1\52\1\56\12\52"+
            "\4\uffff\1\52\1\uffff\6\53\5\52\1\55\1\52\1\57\1\52\1\56\2\52"+
            "\1\54\7\52",
            "\1\64\10\uffff\12\52\1\50\6\uffff\17\52\1\62\2\52\1\63\7\52"+
            "\4\uffff\1\52\1\uffff\17\52\1\62\2\52\1\63\1\60\1\61\5\52",
            "\12\52\1\50\6\uffff\15\52\1\66\14\52\4\uffff\1\52\1\uffff\15"+
            "\52\1\65\14\52",
            "\12\52\1\50\6\uffff\10\52\1\70\21\52\4\uffff\1\52\1\uffff\10"+
            "\52\1\70\5\52\1\67\13\52",
            "\12\52\1\50\6\uffff\21\52\1\72\10\52\4\uffff\1\52\1\uffff\10"+
            "\52\1\71\10\52\1\72\10\52",
            "\1\73",
            "\1\75",
            "",
            "\12\52\1\50\6\uffff\4\52\1\77\25\52\4\uffff\1\52\1\uffff\4"+
            "\52\1\77\25\52",
            "\12\53\1\50\6\uffff\6\53\2\52\1\101\10\52\1\100\10\52\4\uffff"+
            "\1\52\1\uffff\6\53\2\52\1\101\10\52\1\100\10\52",
            "\12\52\1\50\6\uffff\7\52\1\102\1\103\21\52\4\uffff\1\52\1\uffff"+
            "\7\52\1\102\1\103\21\52",
            "\12\53\1\50\6\uffff\6\53\5\52\1\55\1\52\1\57\1\52\1\56\12\52"+
            "\4\uffff\1\52\1\uffff\6\53\5\52\1\55\1\52\1\57\1\52\1\56\12"+
            "\52",
            "\12\52\1\50\6\uffff\4\52\1\104\25\52\4\uffff\1\52\1\uffff\4"+
            "\52\1\104\25\52",
            "\12\53\1\50\6\uffff\6\53\10\52\1\105\2\52\1\106\10\52\4\uffff"+
            "\1\52\1\uffff\6\53\10\52\1\105\2\52\1\106\10\52",
            "\12\52\1\50\6\uffff\17\52\1\62\2\52\1\63\7\52\4\uffff\1\52"+
            "\1\uffff\17\52\1\62\2\52\1\63\7\52",
            "\12\52\1\50\6\uffff\4\52\1\107\11\52\1\110\13\52\4\uffff\1"+
            "\52\1\uffff\4\52\1\107\11\52\1\110\13\52",
            "\12\52\1\50\6\uffff\10\52\1\70\21\52\4\uffff\1\52\1\uffff\10"+
            "\52\1\70\21\52",
            "\12\52\1\50\6\uffff\15\52\1\111\14\52\4\uffff\1\52\1\uffff"+
            "\15\52\1\111\14\52",
            "\12\52\1\50\6\uffff\24\52\1\112\5\52\4\uffff\1\52\1\uffff\24"+
            "\52\1\112\5\52",
            "\12\53\1\50\6\uffff\2\53\1\113\1\53\1\114\1\53\13\52\1\115"+
            "\10\52\4\uffff\1\52\1\uffff\2\53\1\113\1\53\1\114\1\53\13\52"+
            "\1\115\10\52",
            "\12\53\1\50\6\uffff\1\51\3\53\1\47\1\53\24\52\4\uffff\1\52"+
            "\1\uffff\1\51\3\53\1\47\1\53\24\52",
            "\12\52\1\50\6\uffff\21\52\1\72\10\52\4\uffff\1\52\1\uffff\21"+
            "\52\1\72\10\52",
            "\12\52\1\50\6\uffff\15\52\1\66\14\52\4\uffff\1\52\1\uffff\15"+
            "\52\1\66\14\52",
            "",
            "",
            "\1\117\1\uffff\12\120\7\uffff\6\121\32\uffff\6\121",
            "\12\53\1\50\6\uffff\6\53\24\52\4\uffff\1\52\1\uffff\6\53\24"+
            "\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\122\4\uffff\1\43",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\123"+
            "\6\52",
            "",
            "\12\125\1\50\6\uffff\6\125\1\124\23\52\4\uffff\1\52\1\uffff"+
            "\6\125\1\124\23\52",
            "",
            "\12\125\1\50\6\uffff\6\125\15\52\1\126\6\52\4\uffff\1\52\1"+
            "\uffff\6\125\15\52\1\126\6\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\125\1\50\6\uffff\6\125\24\52\4\uffff\1\52\1\uffff\6\125"+
            "\24\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\127\27"+
            "\52",
            "\12\52\1\50\6\uffff\13\52\1\130\16\52\4\uffff\1\52\1\uffff"+
            "\13\52\1\130\16\52",
            "\12\52\1\50\6\uffff\17\52\1\131\12\52\4\uffff\1\52\1\uffff"+
            "\17\52\1\131\12\52",
            "\12\52\1\50\6\uffff\3\52\1\132\26\52\4\uffff\1\52\1\uffff\3"+
            "\52\1\132\26\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\5\52\1\133\24"+
            "\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\134"+
            "\21\52",
            "\12\52\1\50\6\uffff\3\52\1\135\26\52\4\uffff\1\52\1\uffff\3"+
            "\52\1\135\26\52",
            "\12\52\1\50\6\uffff\4\52\1\137\3\52\1\136\21\52\4\uffff\1\52"+
            "\1\uffff\4\52\1\137\3\52\1\136\21\52",
            "",
            "\12\52\1\50\6\uffff\3\52\1\142\26\52\4\uffff\1\52\1\uffff\3"+
            "\52\1\142\17\52\1\140\6\52",
            "\12\52\1\50\6\uffff\3\52\1\142\26\52\4\uffff\1\52\1\uffff\3"+
            "\52\1\142\26\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\143"+
            "\14\52",
            "\12\52\1\50\6\uffff\14\52\1\144\15\52\4\uffff\1\52\1\uffff"+
            "\14\52\1\144\15\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\145"+
            "\15\52",
            "\12\52\1\50\6\uffff\24\52\1\146\5\52\4\uffff\1\52\1\uffff\24"+
            "\52\1\146\5\52",
            "",
            "",
            "",
            "",
            "\12\52\1\50\6\uffff\13\52\1\147\7\52\1\150\6\52\4\uffff\1\52"+
            "\1\uffff\13\52\1\147\7\52\1\150\6\52",
            "\12\52\1\50\6\uffff\16\52\1\151\13\52\4\uffff\1\52\1\uffff"+
            "\16\52\1\151\13\52",
            "\12\52\1\50\6\uffff\21\52\1\152\10\52\4\uffff\1\52\1\uffff"+
            "\21\52\1\152\10\52",
            "\12\52\1\50\6\uffff\4\52\1\153\25\52\4\uffff\1\52\1\uffff\4"+
            "\52\1\153\25\52",
            "\12\52\1\50\6\uffff\23\52\1\154\6\52\4\uffff\1\52\1\uffff\23"+
            "\52\1\154\6\52",
            "\12\52\1\50\6\uffff\30\52\1\155\1\52\4\uffff\1\52\1\uffff\30"+
            "\52\1\155\1\52",
            "\12\52\1\50\6\uffff\13\52\1\157\1\52\1\156\6\52\1\160\5\52"+
            "\4\uffff\1\52\1\uffff\13\52\1\157\1\52\1\156\6\52\1\160\5\52",
            "\12\52\1\50\6\uffff\4\52\1\161\25\52\4\uffff\1\52\1\uffff\4"+
            "\52\1\161\25\52",
            "\12\52\1\50\6\uffff\25\52\1\162\4\52\4\uffff\1\52\1\uffff\25"+
            "\52\1\162\4\52",
            "\12\52\1\50\6\uffff\26\52\1\163\3\52\4\uffff\1\52\1\uffff\26"+
            "\52\1\163\3\52",
            "\12\52\1\50\6\uffff\4\52\1\165\25\52\4\uffff\1\52\1\uffff\4"+
            "\52\1\165\25\52",
            "\12\52\1\50\6\uffff\16\52\1\166\13\52\4\uffff\1\52\1\uffff"+
            "\16\52\1\166\13\52",
            "\12\125\1\50\6\uffff\6\125\12\52\1\167\11\52\4\uffff\1\52\1"+
            "\uffff\6\125\12\52\1\167\11\52",
            "\12\125\1\50\6\uffff\6\125\5\52\1\170\16\52\4\uffff\1\52\1"+
            "\uffff\6\125\5\52\1\170\16\52",
            "\12\52\1\50\6\uffff\16\52\1\171\13\52\4\uffff\1\52\1\uffff"+
            "\16\52\1\171\13\52",
            "",
            "",
            "\1\117\1\uffff\12\172\7\uffff\6\121\32\uffff\6\121",
            "",
            "",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\173\25"+
            "\52",
            "\12\52\1\50\6\uffff\10\52\1\174\21\52\4\uffff\1\52\1\uffff"+
            "\10\52\1\174\21\52",
            "\12\175\1\50\6\uffff\6\175\24\52\4\uffff\1\52\1\uffff\6\175"+
            "\24\52",
            "\12\52\1\50\6\uffff\2\52\1\176\27\52\4\uffff\1\52\1\uffff\2"+
            "\52\1\176\27\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\177"+
            "\21\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\13\52\1\u0081\16\52\4\uffff\1\52\1\uffff"+
            "\13\52\1\u0081\16\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\10\52\1\u0083\1\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff"+
            "\32\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u0084"+
            "\26\52",
            "\12\52\1\50\6\uffff\1\u0085\31\52\4\uffff\1\52\1\uffff\1\u0085"+
            "\31\52",
            "\12\52\1\50\6\uffff\15\52\1\u0086\14\52\4\uffff\1\52\1\uffff"+
            "\15\52\1\u0086\14\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\1\50\6\uffff\4\52\1\u0089\25\52\4\uffff\1\52\1\uffff"+
            "\4\52\1\u0089\25\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u008a"+
            "\23\52",
            "\12\52\1\50\6\uffff\10\52\1\u008b\21\52\4\uffff\1\52\1\uffff"+
            "\10\52\1\u008b\21\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u008c"+
            "\25\52",
            "\12\52\1\50\6\uffff\15\52\1\u008d\14\52\4\uffff\1\52\1\uffff"+
            "\15\52\1\u008d\14\52",
            "\12\52\1\50\6\uffff\4\52\1\u008e\25\52\4\uffff\1\52\1\uffff"+
            "\4\52\1\u008e\25\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\14\52\1\u0090\15\52\4\uffff\1\52\1\uffff"+
            "\14\52\1\u0090\15\52",
            "\12\52\1\50\6\uffff\22\52\1\u0091\7\52\4\uffff\1\52\1\uffff"+
            "\22\52\1\u0091\7\52",
            "\12\52\1\50\6\uffff\21\52\1\u0092\10\52\4\uffff\1\52\1\uffff"+
            "\21\52\1\u0092\10\52",
            "\12\52\1\50\6\uffff\7\52\1\u0093\22\52\4\uffff\1\52\1\uffff"+
            "\7\52\1\u0093\22\52",
            "\12\52\1\50\6\uffff\22\52\1\u0095\7\52\4\uffff\1\52\1\uffff"+
            "\22\52\1\u0095\7\52",
            "\12\52\1\50\6\uffff\22\52\1\u0096\7\52\4\uffff\1\52\1\uffff"+
            "\22\52\1\u0096\7\52",
            "\12\52\1\50\6\uffff\24\52\1\u0098\5\52\4\uffff\1\52\1\uffff"+
            "\24\52\1\u0098\5\52",
            "\12\52\1\50\6\uffff\15\52\1\u0099\14\52\4\uffff\1\52\1\uffff"+
            "\15\52\1\u0099\14\52",
            "\12\52\1\50\6\uffff\1\u009a\31\52\4\uffff\1\52\1\uffff\1\u009a"+
            "\31\52",
            "\12\52\1\50\6\uffff\4\52\1\u009b\25\52\4\uffff\1\52\1\uffff"+
            "\4\52\1\u009b\25\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\21\52\1\u009d\10\52\4\uffff\1\52\1\uffff"+
            "\21\52\1\u009d\10\52",
            "\12\52\1\50\6\uffff\24\52\1\u009e\5\52\4\uffff\1\52\1\uffff"+
            "\24\52\1\u009e\5\52",
            "\12\52\1\50\6\uffff\4\52\1\u009f\25\52\4\uffff\1\52\1\uffff"+
            "\4\52\1\u009f\25\52",
            "\12\52\1\50\6\uffff\17\52\1\u00a0\12\52\4\uffff\1\52\1\uffff"+
            "\17\52\1\u00a0\12\52",
            "\1\117\1\uffff\12\u00a1\7\uffff\6\121\32\uffff\6\121",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u00a2"+
            "\7\52",
            "\12\52\1\50\6\uffff\15\52\1\u00a3\14\52\4\uffff\1\52\1\uffff"+
            "\15\52\1\u00a3\14\52",
            "\12\u00a4\1\50\6\uffff\6\u00a4\24\52\4\uffff\1\52\1\uffff\6"+
            "\u00a4\24\52",
            "\12\52\1\50\6\uffff\7\52\1\u00a5\22\52\4\uffff\1\52\1\uffff"+
            "\7\52\1\u00a5\22\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u00a6"+
            "\21\52",
            "",
            "\12\52\1\50\6\uffff\30\52\1\u00a7\1\52\4\uffff\1\52\1\uffff"+
            "\30\52\1\u00a7\1\52",
            "",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\23\52\1\u00aa\6\52\4\uffff\1\52\1\uffff"+
            "\23\52\1\u00aa\6\52",
            "\12\52\1\50\6\uffff\6\52\1\u00ab\23\52\4\uffff\1\52\1\uffff"+
            "\6\52\1\u00ab\23\52",
            "",
            "",
            "\12\52\1\50\6\uffff\27\52\1\u00ac\2\52\4\uffff\1\52\1\uffff"+
            "\27\52\1\u00ac\2\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\23\52\1\u00ae\6\52\4\uffff\1\52\1\uffff"+
            "\23\52\1\u00ae\6\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\u00af"+
            "\5\52",
            "\12\52\1\50\6\uffff\2\52\1\u00b0\27\52\4\uffff\1\52\1\uffff"+
            "\2\52\1\u00b0\27\52",
            "\12\52\1\50\6\uffff\2\52\1\u00b1\27\52\4\uffff\1\52\1\uffff"+
            "\2\52\1\u00b1\27\52",
            "",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\23\52\1\u00b3\6\52\4\uffff\1\52\1\uffff"+
            "\23\52\1\u00b3\6\52",
            "\12\52\1\50\6\uffff\4\52\1\u00b4\25\52\4\uffff\1\52\1\uffff"+
            "\4\52\1\u00b4\25\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\1\50\6\uffff\17\52\1\u00b6\12\52\4\uffff\1\52\1\uffff"+
            "\17\52\1\u00b6\12\52",
            "\12\52\1\50\6\uffff\10\52\1\u00b7\21\52\4\uffff\1\52\1\uffff"+
            "\10\52\1\u00b7\21\52",
            "",
            "\12\52\1\50\6\uffff\14\52\1\u00b8\15\52\4\uffff\1\52\1\uffff"+
            "\14\52\1\u00b8\15\52",
            "\12\52\1\50\6\uffff\23\52\1\u00b9\6\52\4\uffff\1\52\1\uffff"+
            "\23\52\1\u00b9\6\52",
            "\12\52\1\50\6\uffff\23\52\1\u00ba\6\52\4\uffff\1\52\1\uffff"+
            "\23\52\1\u00ba\6\52",
            "\12\52\1\50\6\uffff\21\52\1\u00bb\10\52\4\uffff\1\52\1\uffff"+
            "\21\52\1\u00bb\10\52",
            "",
            "\12\52\1\50\6\uffff\24\52\1\u00bc\5\52\4\uffff\1\52\1\uffff"+
            "\24\52\1\u00bc\5\52",
            "\12\52\1\50\6\uffff\16\52\1\u00bd\13\52\4\uffff\1\52\1\uffff"+
            "\16\52\1\u00bd\13\52",
            "\12\52\1\50\6\uffff\23\52\1\u00be\6\52\4\uffff\1\52\1\uffff"+
            "\23\52\1\u00be\6\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\117\1\uffff\12\u00c0\7\uffff\6\121\32\uffff\6\121",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\u00c3\1\50\6\uffff\6\u00c3\24\52\4\uffff\1\52\1\uffff\6"+
            "\u00c3\24\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\1\50\6\uffff\4\52\1\u00c7\25\52\4\uffff\1\52\1\uffff"+
            "\4\52\1\u00c7\25\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\u00cb"+
            "\5\52",
            "\12\52\1\50\6\uffff\1\u00cc\31\52\4\uffff\1\52\1\uffff\1\u00cc"+
            "\31\52",
            "\12\52\1\50\6\uffff\23\52\1\u00cd\6\52\4\uffff\1\52\1\uffff"+
            "\23\52\1\u00cd\6\52",
            "",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\1\50\6\uffff\1\u00d0\31\52\4\uffff\1\52\1\uffff\1\u00d0"+
            "\31\52",
            "\12\52\1\50\6\uffff\22\52\1\u00d1\7\52\4\uffff\1\52\1\uffff"+
            "\22\52\1\u00d1\7\52",
            "\12\52\1\50\6\uffff\15\52\1\u00d2\14\52\4\uffff\1\52\1\uffff"+
            "\15\52\1\u00d2\14\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\4\52\1\u00d4\25\52\4\uffff\1\52\1\uffff"+
            "\4\52\1\u00d4\25\52",
            "\12\52\1\50\6\uffff\22\52\1\u00d5\7\52\4\uffff\1\52\1\uffff"+
            "\22\52\1\u00d5\7\52",
            "\12\52\1\50\6\uffff\14\52\1\u00d6\15\52\4\uffff\1\52\1\uffff"+
            "\14\52\1\u00d6\15\52",
            "\12\52\1\50\6\uffff\21\52\1\u00d7\10\52\4\uffff\1\52\1\uffff"+
            "\21\52\1\u00d7\10\52",
            "\12\52\1\50\6\uffff\4\52\1\u00d8\25\52\4\uffff\1\52\1\uffff"+
            "\4\52\1\u00d8\25\52",
            "",
            "\1\117\1\uffff\12\u00d9\7\uffff\6\121\32\uffff\6\121",
            "",
            "",
            "\12\u00da\1\50\6\uffff\6\u00da\24\52\4\uffff\1\52\1\uffff\6"+
            "\u00da\24\52",
            "",
            "",
            "",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u00dc"+
            "\21\52",
            "\12\52\1\50\6\uffff\23\52\1\u00dd\6\52\4\uffff\1\52\1\uffff"+
            "\23\52\1\u00dd\6\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\1\50\6\uffff\2\52\1\u00df\27\52\4\uffff\1\52\1\uffff"+
            "\2\52\1\u00df\27\52",
            "\12\52\1\50\6\uffff\23\52\1\u00e0\6\52\4\uffff\1\52\1\uffff"+
            "\23\52\1\u00e0\6\52",
            "\12\52\1\50\6\uffff\5\52\1\u00e1\24\52\4\uffff\1\52\1\uffff"+
            "\5\52\1\u00e1\24\52",
            "",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\4\52\1\u00e3\25\52\4\uffff\1\52\1\uffff"+
            "\4\52\1\u00e3\25\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\24\52\1\u00e4\5\52\4\uffff\1\52\1\uffff"+
            "\24\52\1\u00e4\5\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\117\1\uffff\12\u00e6\7\uffff\6\121\32\uffff\6\121",
            "\12\u00e7\1\50\6\uffff\6\u00e7\24\52\4\uffff\1\52\1\uffff\6"+
            "\u00e7\24\52",
            "",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u00e8"+
            "\26\52",
            "\12\52\1\50\6\uffff\4\52\1\u00e9\25\52\4\uffff\1\52\1\uffff"+
            "\4\52\1\u00e9\25\52",
            "",
            "\12\52\1\50\6\uffff\4\52\1\u00ea\25\52\4\uffff\1\52\1\uffff"+
            "\4\52\1\u00ea\25\52",
            "\12\52\1\50\6\uffff\4\52\1\u00eb\25\52\4\uffff\1\52\1\uffff"+
            "\4\52\1\u00eb\25\52",
            "\12\52\1\50\6\uffff\1\u00ec\31\52\4\uffff\1\52\1\uffff\1\u00ec"+
            "\31\52",
            "",
            "\12\52\1\50\6\uffff\3\52\1\u00ed\26\52\4\uffff\1\52\1\uffff"+
            "\3\52\1\u00ed\26\52",
            "\12\52\1\50\6\uffff\14\52\1\u00ee\15\52\4\uffff\1\52\1\uffff"+
            "\14\52\1\u00ee\15\52",
            "",
            "\1\117\1\uffff\12\u00ef\7\uffff\6\121\32\uffff\6\121",
            "\1\121\2\uffff\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff"+
            "\32\52",
            "\1\u00f0\7\uffff\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff"+
            "\32\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\15\52\1\u00f4\14\52\4\uffff\1\52\1\uffff"+
            "\15\52\1\u00f4\14\52",
            "\12\52\1\50\6\uffff\14\52\1\u00f5\15\52\4\uffff\1\52\1\uffff"+
            "\14\52\1\u00f5\15\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\22\52\1\u00f7\7\52\4\uffff\1\52\1\uffff"+
            "\22\52\1\u00f7\7\52",
            "\1\121\1\117\1\uffff\12\u00f8",
            "",
            "",
            "",
            "",
            "\12\52\1\50\6\uffff\2\52\1\u00f9\27\52\4\uffff\1\52\1\uffff"+
            "\2\52\1\u00f9\27\52",
            "\12\52\1\50\6\uffff\10\52\1\u00fa\21\52\4\uffff\1\52\1\uffff"+
            "\10\52\1\u00fa\21\52",
            "",
            "\12\52\1\50\6\uffff\30\52\1\u00fb\1\52\4\uffff\1\52\1\uffff"+
            "\30\52\1\u00fb\1\52",
            "\1\117\1\uffff\12\u00f8",
            "\12\52\1\50\6\uffff\30\52\1\u00fc\1\52\4\uffff\1\52\1\uffff"+
            "\30\52\1\u00fc\1\52",
            "\12\52\1\50\6\uffff\13\52\1\u00fd\16\52\4\uffff\1\52\1\uffff"+
            "\13\52\1\u00fd\16\52",
            "\12\52\1\50\6\uffff\15\52\1\u00fe\14\52\4\uffff\1\52\1\uffff"+
            "\15\52\1\u00fe\14\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\30\52\1\u0100\1\52\4\uffff\1\52\1\uffff"+
            "\30\52\1\u0100\1\52",
            "\12\52\1\50\6\uffff\2\52\1\u0101\27\52\4\uffff\1\52\1\uffff"+
            "\2\52\1\u0101\27\52",
            "",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\50\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | K_SELECT | K_FROM | K_WHERE | K_AND | K_KEY | K_COLUMN | K_UPDATE | K_WITH | K_ROW | K_LIMIT | K_USING | K_CONSISTENCY | K_LEVEL | K_USE | K_FIRST | K_REVERSED | K_COUNT | K_SET | K_BEGIN | K_APPLY | K_BATCH | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_COLUMNFAMILY | K_INDEX | K_ON | K_DROP | STRING_LITERAL | RANGEOP | INTEGER | FLOAT | IDENT | COMPIDENT | UNICODE | UUID | WS | COMMENT | MULTILINE_COMMENT );";
        }
    }
 

}