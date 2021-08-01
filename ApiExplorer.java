import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
    public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://api.data.go.kr/openapi/tn_pubr_public_campg_api"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=서비스키"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("0", "UTF-8")); /*페이지 번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); /*XML/JSON 여부*/
        urlBuilder.append("&" + URLEncoder.encode("ADMIN_NO","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*관리번호*/
        urlBuilder.append("&" + URLEncoder.encode("PER_DATE","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*인허가일자*/
        urlBuilder.append("&" + URLEncoder.encode("PER_CANCLE_DATE","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*인허가취소일자*/
        urlBuilder.append("&" + URLEncoder.encode("business_ST_CD","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*영업상태구분코드*/
        urlBuilder.append("&" + URLEncoder.encode("CLOSED_DATE","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*폐업일자*/
        urlBuilder.append("&" + URLEncoder.encode("TMP_CLOSED_DATE","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*휴업시작일자*/
        urlBuilder.append("&" + URLEncoder.encode("REOPENING_DATE","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*재개업일자*/
        urlBuilder.append("&" + URLEncoder.encode("CAMPG_NM","UTF-8") + "=" + URLEncoder.encode("오션파크", "UTF-8")); /*야영(캠핑)장명*/
        urlBuilder.append("&" + URLEncoder.encode("CAMPG_SE","UTF-8") + "=" + URLEncoder.encode("야영장", "UTF-8")); /*야영(캠핑)장구분*/
        urlBuilder.append("&" + URLEncoder.encode("LATITUDE","UTF-8") + "=" + URLEncoder.encode("36.6744920527", "UTF-8")); /*위도*/
        urlBuilder.append("&" + URLEncoder.encode("LONGITUDE","UTF-8") + "=" + URLEncoder.encode("126.2808663915", "UTF-8")); /*경도*/
        urlBuilder.append("&" + URLEncoder.encode("RDNMADR","UTF-8") + "=" + URLEncoder.encode("충청남도 태안군 남면 몽산포길 161", "UTF-8")); /*소재지도로명주소*/
        urlBuilder.append("&" + URLEncoder.encode("LNMADR","UTF-8") + "=" + URLEncoder.encode("충청남도 태안군 남면 몽산리 782-13", "UTF-8")); /*소재지지번주소*/
        urlBuilder.append("&" + URLEncoder.encode("OFFICE_PHONE_NUMBER","UTF-8") + "=" + URLEncoder.encode("041-672-3043", "UTF-8")); /*야영장전화번호*/
        urlBuilder.append("&" + URLEncoder.encode("CAMPG_UNIT_SPCE","UTF-8") + "=" + URLEncoder.encode("2", "UTF-8")); /*야영사이트수*/
        urlBuilder.append("&" + URLEncoder.encode("PLOT_AR","UTF-8") + "=" + URLEncoder.encode("4899", "UTF-8")); /*부지면적*/
        urlBuilder.append("&" + URLEncoder.encode("BILDNG_TOTAR","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*건축연면적*/
        urlBuilder.append("&" + URLEncoder.encode("facility_AR","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*시설면적*/
        urlBuilder.append("&" + URLEncoder.encode("CUL_SPO_NM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*문화체육업종명*/
        urlBuilder.append("&" + URLEncoder.encode("CUL_SE_NM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*문화사업자구분명*/
        urlBuilder.append("&" + URLEncoder.encode("LOCAL_SE_NM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*지역구분명*/
        urlBuilder.append("&" + URLEncoder.encode("TOTAL_Floor","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*총층수*/
        urlBuilder.append("&" + URLEncoder.encode("environment_NM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*주변환경명*/
        urlBuilder.append("&" + URLEncoder.encode("INSU_AG_NM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*보험기관명*/
        urlBuilder.append("&" + URLEncoder.encode("BILDNG_PUR_NM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*건물용도명*/
        urlBuilder.append("&" + URLEncoder.encode("UPER_Floor","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*지상층수*/
        urlBuilder.append("&" + URLEncoder.encode("UNDER_Floor","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*지하층수*/
        urlBuilder.append("&" + URLEncoder.encode("TOTAL_ROOMS","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*객실수*/
        urlBuilder.append("&" + URLEncoder.encode("INSU_ST_DATE","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*보험시작일자*/
        urlBuilder.append("&" + URLEncoder.encode("INSU_END_DATE","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*보험종료일자*/
        urlBuilder.append("&" + URLEncoder.encode("DAY_ACMD_CO","UTF-8") + "=" + URLEncoder.encode("104", "UTF-8")); /*1일최대수용인원수*/
        urlBuilder.append("&" + URLEncoder.encode("PRKPLCE_CO","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*주차장면수*/
        urlBuilder.append("&" + URLEncoder.encode("CVNTL","UTF-8") + "=" + URLEncoder.encode("전기시설+하수도시설", "UTF-8")); /*편의시설*/
        urlBuilder.append("&" + URLEncoder.encode("SAFENTL","UTF-8") + "=" + URLEncoder.encode("소화기+대피공간", "UTF-8")); /*안전시설*/
        urlBuilder.append("&" + URLEncoder.encode("ETCTY","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*기타부대시설*/
        urlBuilder.append("&" + URLEncoder.encode("USE_TIME","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*이용시간*/
        urlBuilder.append("&" + URLEncoder.encode("USE_CHARGE","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*이용요금*/
        urlBuilder.append("&" + URLEncoder.encode("PHONE_NUMBER","UTF-8") + "=" + URLEncoder.encode("041-670-2766", "UTF-8")); /*관리기관전화번호*/
        urlBuilder.append("&" + URLEncoder.encode("INSTITUTION_NM","UTF-8") + "=" + URLEncoder.encode("태안군청", "UTF-8")); /*관리기관명*/
        urlBuilder.append("&" + URLEncoder.encode("REFERENCE_DATE","UTF-8") + "=" + URLEncoder.encode("2020-01-28", "UTF-8")); /*데이터기준일자*/
        urlBuilder.append("&" + URLEncoder.encode("instt_code","UTF-8") + "=" + URLEncoder.encode("6440000", "UTF-8")); /*제공기관코드*/
        urlBuilder.append("&" + URLEncoder.encode("instt_nm","UTF-8") + "=" + URLEncoder.encode("충청남도", "UTF-8")); /*제공기관기관명*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}
