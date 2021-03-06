package com.ningso.libcurl.generates;

import java.util.HashMap;

/**
 * Created by NingSo on 16/3/12.下午5:30
 * Auto generated from 'curl/curl.h', DO NOT EDIT!!!
 *
 * @author: NingSo
 */
public interface CurlOpt {

    enum OptObjectPoint {
        CURLOPT_WRITEDATA(CurlConstant.CURLOPT_WRITEDATA), //
        CURLOPT_URL(CurlConstant.CURLOPT_URL), //
        CURLOPT_PROXY(CurlConstant.CURLOPT_PROXY), //
        CURLOPT_USERPWD(CurlConstant.CURLOPT_USERPWD), //
        CURLOPT_PROXYUSERPWD(CurlConstant.CURLOPT_PROXYUSERPWD), //
        CURLOPT_RANGE(CurlConstant.CURLOPT_RANGE), //
        CURLOPT_READDATA(CurlConstant.CURLOPT_READDATA), //
        CURLOPT_ERRORBUFFER(CurlConstant.CURLOPT_ERRORBUFFER), //
        CURLOPT_POSTFIELDS(CurlConstant.CURLOPT_POSTFIELDS), //
        CURLOPT_REFERER(CurlConstant.CURLOPT_REFERER), //
        CURLOPT_FTPPORT(CurlConstant.CURLOPT_FTPPORT), //
        CURLOPT_USERAGENT(CurlConstant.CURLOPT_USERAGENT), //
        CURLOPT_COOKIE(CurlConstant.CURLOPT_COOKIE), //
        CURLOPT_HTTPHEADER(CurlConstant.CURLOPT_HTTPHEADER), //
        CURLOPT_HTTPPOST(CurlConstant.CURLOPT_HTTPPOST), //
        CURLOPT_SSLCERT(CurlConstant.CURLOPT_SSLCERT), //
        CURLOPT_KEYPASSWD(CurlConstant.CURLOPT_KEYPASSWD), //
        CURLOPT_QUOTE(CurlConstant.CURLOPT_QUOTE), //
        CURLOPT_HEADERDATA(CurlConstant.CURLOPT_HEADERDATA), //
        CURLOPT_COOKIEFILE(CurlConstant.CURLOPT_COOKIEFILE), //
        CURLOPT_CUSTOMREQUEST(CurlConstant.CURLOPT_CUSTOMREQUEST), //
        CURLOPT_STDERR(CurlConstant.CURLOPT_STDERR), //
        CURLOPT_POSTQUOTE(CurlConstant.CURLOPT_POSTQUOTE), //
        CURLOPT_OBSOLETE40(CurlConstant.CURLOPT_OBSOLETE40), //
        CURLOPT_PROGRESSDATA(CurlConstant.CURLOPT_PROGRESSDATA), //
        CURLOPT_INTERFACE(CurlConstant.CURLOPT_INTERFACE), //
        CURLOPT_KRBLEVEL(CurlConstant.CURLOPT_KRBLEVEL), //
        CURLOPT_CAINFO(CurlConstant.CURLOPT_CAINFO), //
        CURLOPT_TELNETOPTIONS(CurlConstant.CURLOPT_TELNETOPTIONS), //
        CURLOPT_RANDOM_FILE(CurlConstant.CURLOPT_RANDOM_FILE), //
        CURLOPT_EGDSOCKET(CurlConstant.CURLOPT_EGDSOCKET), //
        CURLOPT_COOKIEJAR(CurlConstant.CURLOPT_COOKIEJAR), //
        CURLOPT_SSL_CIPHER_LIST(CurlConstant.CURLOPT_SSL_CIPHER_LIST), //
        CURLOPT_SSLCERTTYPE(CurlConstant.CURLOPT_SSLCERTTYPE), //
        CURLOPT_SSLKEY(CurlConstant.CURLOPT_SSLKEY), //
        CURLOPT_SSLKEYTYPE(CurlConstant.CURLOPT_SSLKEYTYPE), //
        CURLOPT_SSLENGINE(CurlConstant.CURLOPT_SSLENGINE), //
        CURLOPT_PREQUOTE(CurlConstant.CURLOPT_PREQUOTE), //
        CURLOPT_DEBUGDATA(CurlConstant.CURLOPT_DEBUGDATA), //
        CURLOPT_CAPATH(CurlConstant.CURLOPT_CAPATH), //
        CURLOPT_SHARE(CurlConstant.CURLOPT_SHARE), //
        CURLOPT_ACCEPT_ENCODING(CurlConstant.CURLOPT_ACCEPT_ENCODING), //
        CURLOPT_PRIVATE(CurlConstant.CURLOPT_PRIVATE), //
        CURLOPT_HTTP200ALIASES(CurlConstant.CURLOPT_HTTP200ALIASES), //
        CURLOPT_SSL_CTX_DATA(CurlConstant.CURLOPT_SSL_CTX_DATA), //
        CURLOPT_NETRC_FILE(CurlConstant.CURLOPT_NETRC_FILE), //
        CURLOPT_IOCTLDATA(CurlConstant.CURLOPT_IOCTLDATA), //
        CURLOPT_FTP_ACCOUNT(CurlConstant.CURLOPT_FTP_ACCOUNT), //
        CURLOPT_COOKIELIST(CurlConstant.CURLOPT_COOKIELIST), //
        CURLOPT_FTP_ALTERNATIVE_TO_USER(CurlConstant.CURLOPT_FTP_ALTERNATIVE_TO_USER), //
        CURLOPT_SOCKOPTDATA(CurlConstant.CURLOPT_SOCKOPTDATA), //
        CURLOPT_SSH_PUBLIC_KEYFILE(CurlConstant.CURLOPT_SSH_PUBLIC_KEYFILE), //
        CURLOPT_SSH_PRIVATE_KEYFILE(CurlConstant.CURLOPT_SSH_PRIVATE_KEYFILE), //
        CURLOPT_SSH_HOST_PUBLIC_KEY_MD5(CurlConstant.CURLOPT_SSH_HOST_PUBLIC_KEY_MD5), //
        CURLOPT_OPENSOCKETDATA(CurlConstant.CURLOPT_OPENSOCKETDATA), //
        CURLOPT_COPYPOSTFIELDS(CurlConstant.CURLOPT_COPYPOSTFIELDS), //
        CURLOPT_SEEKDATA(CurlConstant.CURLOPT_SEEKDATA), //
        CURLOPT_CRLFILE(CurlConstant.CURLOPT_CRLFILE), //
        CURLOPT_ISSUERCERT(CurlConstant.CURLOPT_ISSUERCERT), //
        CURLOPT_USERNAME(CurlConstant.CURLOPT_USERNAME), //
        CURLOPT_PASSWORD(CurlConstant.CURLOPT_PASSWORD), //
        CURLOPT_PROXYUSERNAME(CurlConstant.CURLOPT_PROXYUSERNAME), //
        CURLOPT_PROXYPASSWORD(CurlConstant.CURLOPT_PROXYPASSWORD), //
        CURLOPT_NOPROXY(CurlConstant.CURLOPT_NOPROXY), //
        CURLOPT_SOCKS5_GSSAPI_SERVICE(CurlConstant.CURLOPT_SOCKS5_GSSAPI_SERVICE), //
        CURLOPT_SSH_KNOWNHOSTS(CurlConstant.CURLOPT_SSH_KNOWNHOSTS), //
        CURLOPT_SSH_KEYDATA(CurlConstant.CURLOPT_SSH_KEYDATA), //
        CURLOPT_MAIL_FROM(CurlConstant.CURLOPT_MAIL_FROM), //
        CURLOPT_MAIL_RCPT(CurlConstant.CURLOPT_MAIL_RCPT), //
        CURLOPT_RTSP_SESSION_ID(CurlConstant.CURLOPT_RTSP_SESSION_ID), //
        CURLOPT_RTSP_STREAM_URI(CurlConstant.CURLOPT_RTSP_STREAM_URI), //
        CURLOPT_RTSP_TRANSPORT(CurlConstant.CURLOPT_RTSP_TRANSPORT), //
        CURLOPT_INTERLEAVEDATA(CurlConstant.CURLOPT_INTERLEAVEDATA), //
        CURLOPT_CHUNK_DATA(CurlConstant.CURLOPT_CHUNK_DATA), //
        CURLOPT_FNMATCH_DATA(CurlConstant.CURLOPT_FNMATCH_DATA), //
        CURLOPT_RESOLVE(CurlConstant.CURLOPT_RESOLVE), //
        CURLOPT_TLSAUTH_USERNAME(CurlConstant.CURLOPT_TLSAUTH_USERNAME), //
        CURLOPT_TLSAUTH_PASSWORD(CurlConstant.CURLOPT_TLSAUTH_PASSWORD), //
        CURLOPT_TLSAUTH_TYPE(CurlConstant.CURLOPT_TLSAUTH_TYPE), //
        CURLOPT_CLOSESOCKETDATA(CurlConstant.CURLOPT_CLOSESOCKETDATA), //
        CURLOPT_DNS_SERVERS(CurlConstant.CURLOPT_DNS_SERVERS), //
        CURLOPT_MAIL_AUTH(CurlConstant.CURLOPT_MAIL_AUTH), //
        CURLOPT_XOAUTH2_BEARER(CurlConstant.CURLOPT_XOAUTH2_BEARER), //
        CURLOPT_DNS_INTERFACE(CurlConstant.CURLOPT_DNS_INTERFACE), //
        CURLOPT_DNS_LOCAL_IP4(CurlConstant.CURLOPT_DNS_LOCAL_IP4), //
        CURLOPT_DNS_LOCAL_IP6(CurlConstant.CURLOPT_DNS_LOCAL_IP6), //
        CURLOPT_LOGIN_OPTIONS(CurlConstant.CURLOPT_LOGIN_OPTIONS), //
        CURLOPT_PROXYHEADER(CurlConstant.CURLOPT_PROXYHEADER), //
        CURLOPT_PINNEDPUBLICKEY(CurlConstant.CURLOPT_PINNEDPUBLICKEY), //
        CURLOPT_UNIX_SOCKET_PATH(CurlConstant.CURLOPT_UNIX_SOCKET_PATH);

        private final int value;

        private static HashMap<Integer, OptObjectPoint> valuesMap = new HashMap<>();

        static {
            for (OptObjectPoint e : values()) {
                valuesMap.put(e.getValue(), e);
            }
        }

        OptObjectPoint(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static OptObjectPoint fromValue(int value) {
            return valuesMap.get(value);
        }

    }

    enum OptLong {
        CURLOPT_PORT(CurlConstant.CURLOPT_PORT), //
        CURLOPT_TIMEOUT(CurlConstant.CURLOPT_TIMEOUT), //
        CURLOPT_INFILESIZE(CurlConstant.CURLOPT_INFILESIZE), //
        CURLOPT_LOW_SPEED_LIMIT(CurlConstant.CURLOPT_LOW_SPEED_LIMIT), //
        CURLOPT_LOW_SPEED_TIME(CurlConstant.CURLOPT_LOW_SPEED_TIME), //
        CURLOPT_RESUME_FROM(CurlConstant.CURLOPT_RESUME_FROM), //
        CURLOPT_CRLF(CurlConstant.CURLOPT_CRLF), //
        CURLOPT_SSLVERSION(CurlConstant.CURLOPT_SSLVERSION), //
        CURLOPT_TIMECONDITION(CurlConstant.CURLOPT_TIMECONDITION), //
        CURLOPT_TIMEVALUE(CurlConstant.CURLOPT_TIMEVALUE), //
        CURLOPT_VERBOSE(CurlConstant.CURLOPT_VERBOSE), //
        CURLOPT_HEADER(CurlConstant.CURLOPT_HEADER), //
        CURLOPT_NOPROGRESS(CurlConstant.CURLOPT_NOPROGRESS), //
        CURLOPT_NOBODY(CurlConstant.CURLOPT_NOBODY), //
        CURLOPT_FAILONERROR(CurlConstant.CURLOPT_FAILONERROR), //
        CURLOPT_UPLOAD(CurlConstant.CURLOPT_UPLOAD), //
        CURLOPT_POST(CurlConstant.CURLOPT_POST), //
        CURLOPT_DIRLISTONLY(CurlConstant.CURLOPT_DIRLISTONLY), //
        CURLOPT_APPEND(CurlConstant.CURLOPT_APPEND), //
        CURLOPT_NETRC(CurlConstant.CURLOPT_NETRC), //
        CURLOPT_FOLLOWLOCATION(CurlConstant.CURLOPT_FOLLOWLOCATION), //
        CURLOPT_TRANSFERTEXT(CurlConstant.CURLOPT_TRANSFERTEXT), //
        CURLOPT_PUT(CurlConstant.CURLOPT_PUT), //
        CURLOPT_AUTOREFERER(CurlConstant.CURLOPT_AUTOREFERER), //
        CURLOPT_PROXYPORT(CurlConstant.CURLOPT_PROXYPORT), //
        CURLOPT_POSTFIELDSIZE(CurlConstant.CURLOPT_POSTFIELDSIZE), //
        CURLOPT_HTTPPROXYTUNNEL(CurlConstant.CURLOPT_HTTPPROXYTUNNEL), //
        CURLOPT_SSL_VERIFYPEER(CurlConstant.CURLOPT_SSL_VERIFYPEER), //
        CURLOPT_MAXREDIRS(CurlConstant.CURLOPT_MAXREDIRS), //
        CURLOPT_FILETIME(CurlConstant.CURLOPT_FILETIME), //
        CURLOPT_MAXCONNECTS(CurlConstant.CURLOPT_MAXCONNECTS), //
        CURLOPT_OBSOLETE72(CurlConstant.CURLOPT_OBSOLETE72), //
        CURLOPT_FRESH_CONNECT(CurlConstant.CURLOPT_FRESH_CONNECT), //
        CURLOPT_FORBID_REUSE(CurlConstant.CURLOPT_FORBID_REUSE), //
        CURLOPT_CONNECTTIMEOUT(CurlConstant.CURLOPT_CONNECTTIMEOUT), //
        CURLOPT_HTTPGET(CurlConstant.CURLOPT_HTTPGET), //
        CURLOPT_SSL_VERIFYHOST(CurlConstant.CURLOPT_SSL_VERIFYHOST), //
        CURLOPT_HTTP_VERSION(CurlConstant.CURLOPT_HTTP_VERSION), //
        CURLOPT_FTP_USE_EPSV(CurlConstant.CURLOPT_FTP_USE_EPSV), //
        CURLOPT_SSLENGINE_DEFAULT(CurlConstant.CURLOPT_SSLENGINE_DEFAULT), //
        CURLOPT_DNS_USE_GLOBAL_CACHE(CurlConstant.CURLOPT_DNS_USE_GLOBAL_CACHE), //
        CURLOPT_DNS_CACHE_TIMEOUT(CurlConstant.CURLOPT_DNS_CACHE_TIMEOUT), //
        CURLOPT_COOKIESESSION(CurlConstant.CURLOPT_COOKIESESSION), //
        CURLOPT_BUFFERSIZE(CurlConstant.CURLOPT_BUFFERSIZE), //
        CURLOPT_NOSIGNAL(CurlConstant.CURLOPT_NOSIGNAL), //
        CURLOPT_PROXYTYPE(CurlConstant.CURLOPT_PROXYTYPE), //
        CURLOPT_UNRESTRICTED_AUTH(CurlConstant.CURLOPT_UNRESTRICTED_AUTH), //
        CURLOPT_FTP_USE_EPRT(CurlConstant.CURLOPT_FTP_USE_EPRT), //
        CURLOPT_HTTPAUTH(CurlConstant.CURLOPT_HTTPAUTH), //
        CURLOPT_FTP_CREATE_MISSING_DIRS(CurlConstant.CURLOPT_FTP_CREATE_MISSING_DIRS), //
        CURLOPT_PROXYAUTH(CurlConstant.CURLOPT_PROXYAUTH), //
        CURLOPT_FTP_RESPONSE_TIMEOUT(CurlConstant.CURLOPT_FTP_RESPONSE_TIMEOUT), //
        CURLOPT_IPRESOLVE(CurlConstant.CURLOPT_IPRESOLVE), //
        CURLOPT_MAXFILESIZE(CurlConstant.CURLOPT_MAXFILESIZE), //
        CURLOPT_USE_SSL(CurlConstant.CURLOPT_USE_SSL), //
        CURLOPT_TCP_NODELAY(CurlConstant.CURLOPT_TCP_NODELAY), //
        CURLOPT_FTPSSLAUTH(CurlConstant.CURLOPT_FTPSSLAUTH), //
        CURLOPT_IGNORE_CONTENT_LENGTH(CurlConstant.CURLOPT_IGNORE_CONTENT_LENGTH), //
        CURLOPT_FTP_SKIP_PASV_IP(CurlConstant.CURLOPT_FTP_SKIP_PASV_IP), //
        CURLOPT_FTP_FILEMETHOD(CurlConstant.CURLOPT_FTP_FILEMETHOD), //
        CURLOPT_LOCALPORT(CurlConstant.CURLOPT_LOCALPORT), //
        CURLOPT_LOCALPORTRANGE(CurlConstant.CURLOPT_LOCALPORTRANGE), //
        CURLOPT_CONNECT_ONLY(CurlConstant.CURLOPT_CONNECT_ONLY), //
        CURLOPT_SSL_SESSIONID_CACHE(CurlConstant.CURLOPT_SSL_SESSIONID_CACHE), //
        CURLOPT_SSH_AUTH_TYPES(CurlConstant.CURLOPT_SSH_AUTH_TYPES), //
        CURLOPT_FTP_SSL_CCC(CurlConstant.CURLOPT_FTP_SSL_CCC), //
        CURLOPT_TIMEOUT_MS(CurlConstant.CURLOPT_TIMEOUT_MS), //
        CURLOPT_CONNECTTIMEOUT_MS(CurlConstant.CURLOPT_CONNECTTIMEOUT_MS), //
        CURLOPT_HTTP_TRANSFER_DECODING(CurlConstant.CURLOPT_HTTP_TRANSFER_DECODING), //
        CURLOPT_HTTP_CONTENT_DECODING(CurlConstant.CURLOPT_HTTP_CONTENT_DECODING), //
        CURLOPT_NEW_FILE_PERMS(CurlConstant.CURLOPT_NEW_FILE_PERMS), //
        CURLOPT_NEW_DIRECTORY_PERMS(CurlConstant.CURLOPT_NEW_DIRECTORY_PERMS), //
        CURLOPT_POSTREDIR(CurlConstant.CURLOPT_POSTREDIR), //
        CURLOPT_PROXY_TRANSFER_MODE(CurlConstant.CURLOPT_PROXY_TRANSFER_MODE), //
        CURLOPT_ADDRESS_SCOPE(CurlConstant.CURLOPT_ADDRESS_SCOPE), //
        CURLOPT_CERTINFO(CurlConstant.CURLOPT_CERTINFO), //
        CURLOPT_TFTP_BLKSIZE(CurlConstant.CURLOPT_TFTP_BLKSIZE), //
        CURLOPT_SOCKS5_GSSAPI_NEC(CurlConstant.CURLOPT_SOCKS5_GSSAPI_NEC), //
        CURLOPT_PROTOCOLS(CurlConstant.CURLOPT_PROTOCOLS), //
        CURLOPT_REDIR_PROTOCOLS(CurlConstant.CURLOPT_REDIR_PROTOCOLS), //
        CURLOPT_FTP_USE_PRET(CurlConstant.CURLOPT_FTP_USE_PRET), //
        CURLOPT_RTSP_REQUEST(CurlConstant.CURLOPT_RTSP_REQUEST), //
        CURLOPT_RTSP_CLIENT_CSEQ(CurlConstant.CURLOPT_RTSP_CLIENT_CSEQ), //
        CURLOPT_RTSP_SERVER_CSEQ(CurlConstant.CURLOPT_RTSP_SERVER_CSEQ), //
        CURLOPT_WILDCARDMATCH(CurlConstant.CURLOPT_WILDCARDMATCH), //
        CURLOPT_TRANSFER_ENCODING(CurlConstant.CURLOPT_TRANSFER_ENCODING), //
        CURLOPT_GSSAPI_DELEGATION(CurlConstant.CURLOPT_GSSAPI_DELEGATION), //
        CURLOPT_ACCEPTTIMEOUT_MS(CurlConstant.CURLOPT_ACCEPTTIMEOUT_MS), //
        CURLOPT_TCP_KEEPALIVE(CurlConstant.CURLOPT_TCP_KEEPALIVE), //
        CURLOPT_TCP_KEEPIDLE(CurlConstant.CURLOPT_TCP_KEEPIDLE), //
        CURLOPT_TCP_KEEPINTVL(CurlConstant.CURLOPT_TCP_KEEPINTVL), //
        CURLOPT_SSL_OPTIONS(CurlConstant.CURLOPT_SSL_OPTIONS), //
        CURLOPT_SASL_IR(CurlConstant.CURLOPT_SASL_IR), //
        CURLOPT_SSL_ENABLE_NPN(CurlConstant.CURLOPT_SSL_ENABLE_NPN), //
        CURLOPT_SSL_ENABLE_ALPN(CurlConstant.CURLOPT_SSL_ENABLE_ALPN), //
        CURLOPT_EXPECT_100_TIMEOUT_MS(CurlConstant.CURLOPT_EXPECT_100_TIMEOUT_MS), //
        CURLOPT_HEADEROPT(CurlConstant.CURLOPT_HEADEROPT);


        private final int value;

        private static HashMap<Integer, OptLong> valuesMap = new HashMap<>();

        static {
            for (OptLong e : values()) {
                valuesMap.put(e.getValue(), e);
            }
        }

        OptLong(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static OptLong fromValue(int value) {
            return valuesMap.get(value);
        }

    }

    enum OptFunctionPoint {
        CURLOPT_WRITEFUNCTION(CurlConstant.CURLOPT_WRITEFUNCTION), //
        CURLOPT_READFUNCTION(CurlConstant.CURLOPT_READFUNCTION), //
        CURLOPT_PROGRESSFUNCTION(CurlConstant.CURLOPT_PROGRESSFUNCTION), //
        CURLOPT_HEADERFUNCTION(CurlConstant.CURLOPT_HEADERFUNCTION), //
        CURLOPT_DEBUGFUNCTION(CurlConstant.CURLOPT_DEBUGFUNCTION), //
        CURLOPT_SSL_CTX_FUNCTION(CurlConstant.CURLOPT_SSL_CTX_FUNCTION), //
        CURLOPT_IOCTLFUNCTION(CurlConstant.CURLOPT_IOCTLFUNCTION), //
        CURLOPT_CONV_FROM_NETWORK_FUNCTION(CurlConstant.CURLOPT_CONV_FROM_NETWORK_FUNCTION), //
        CURLOPT_CONV_TO_NETWORK_FUNCTION(CurlConstant.CURLOPT_CONV_TO_NETWORK_FUNCTION), //
        CURLOPT_CONV_FROM_UTF8_FUNCTION(CurlConstant.CURLOPT_CONV_FROM_UTF8_FUNCTION), //
        CURLOPT_SOCKOPTFUNCTION(CurlConstant.CURLOPT_SOCKOPTFUNCTION), //
        CURLOPT_OPENSOCKETFUNCTION(CurlConstant.CURLOPT_OPENSOCKETFUNCTION), //
        CURLOPT_SEEKFUNCTION(CurlConstant.CURLOPT_SEEKFUNCTION), //
        CURLOPT_SSH_KEYFUNCTION(CurlConstant.CURLOPT_SSH_KEYFUNCTION), //
        CURLOPT_INTERLEAVEFUNCTION(CurlConstant.CURLOPT_INTERLEAVEFUNCTION), //
        CURLOPT_CHUNK_BGN_FUNCTION(CurlConstant.CURLOPT_CHUNK_BGN_FUNCTION), //
        CURLOPT_CHUNK_END_FUNCTION(CurlConstant.CURLOPT_CHUNK_END_FUNCTION), //
        CURLOPT_FNMATCH_FUNCTION(CurlConstant.CURLOPT_FNMATCH_FUNCTION), //
        CURLOPT_CLOSESOCKETFUNCTION(CurlConstant.CURLOPT_CLOSESOCKETFUNCTION), //
        CURLOPT_XFERINFOFUNCTION(CurlConstant.CURLOPT_XFERINFOFUNCTION);


        private final int value;

        private static HashMap<Integer, OptFunctionPoint> valuesMap = new HashMap<>();

        static {
            for (OptFunctionPoint e : values()) {
                valuesMap.put(e.getValue(), e);
            }
        }

        OptFunctionPoint(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static OptFunctionPoint fromValue(int value) {
            return valuesMap.get(value);
        }
    }
}
